package org.easy.inheritance;
import jakarta.persistence.Column;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;

@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	@Id @GeneratedValue
	int id;
	
	String name;
	
	String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
