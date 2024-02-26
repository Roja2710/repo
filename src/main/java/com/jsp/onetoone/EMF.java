package com.jsp.onetoone;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setName("rr");
		person.setAge(23);
		person.setAadhar(345678911);
		Aadhar aadhar = new Aadhar();
		aadhar.setId(1);
		aadhar.setAddress("putta(v),hyd");
		aadhar.setPhone(987654321);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("roja");
		System.out.println(entityManagerFactory);
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAadhar());
		System.out.println(person.getClass());

		
		
	}

}
