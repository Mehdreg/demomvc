package com.sip.demomvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.sip.demomvc.entity.Etudiant;

public interface DemoMVCRepository extends CrudRepository<Etudiant, Integer> {
     
    public Etudiant findByName(String name);
    
    public Etudiant update(Integer id);
    
    public Etudiant save(Integer id);
    
    public Etudiant delete(Integer id);
}