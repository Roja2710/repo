package com.jsp.manytoone;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEMF2 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("roja");
		System.out.println(entityManagerFactory);
	}

}
