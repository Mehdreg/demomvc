package com.sip.demomvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(length = 64, unique = true, nullable = false)
    private String name;
     
    @Column(length = 64, unique = true, nullable = false)
    private Integer age;
     
    public Etudiant(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
 
    public Etudiant() {
    }
 
    // getters and setters are not shown for brevity...
 
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	} 
}