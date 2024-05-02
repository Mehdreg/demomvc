package com.sip.demomvc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.sip.demomvc.entity.Etudiant;
import com.sip.demomvc.repository.DemoMVCRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestDemoDataController {
	
	@Autowired
    private DemoMVCRepository repo;

    @Test
    @Rollback(false)
    @Order(1)
    public void testCreateEtudiant() {
        Etudiant savedEtudiant = repo.save(new Etudiant("Mehdi", 21)); //save
         
        assertThat(savedEtudiant.getId()).isGreaterThan(0);
    }
    
    @Test
    @Order(2)
    public void testFindEtudiantByName() {
        Etudiant etudiant = repo.findByName("Mehdi");    // findByName 
        assertThat(etudiant.getName()).isEqualTo("Mehdi");
    }

    @Test
    @Order(3)
    public void testUpdateEtudiant() {
        Etudiant savedEtudiant = repo.update(1); //update
         
        assertThat(savedEtudiant.getId()).isGreaterThan(0);
    }
    
    @Test
    @Order(4)
    public void testDeleteEtudiant() {
        Etudiant etudiant = repo.delete(1);    // delete
        assertThat(etudiant.getId()).isEqualTo(null);
    }
}
