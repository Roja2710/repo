package com.jsp.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person2 {
	@Id
	private int id;
	private String name;
	private int age;
	@OneToMany(mappedBy="p")
	private List<ATM>atms;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<ATM> getAtms() {
		return atms;
	}
	public void setAtms(List<ATM> atms) {
		this.atms = atms;
	}
	

}
