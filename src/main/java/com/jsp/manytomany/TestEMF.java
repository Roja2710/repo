package com.jsp.manytomany;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEMF {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("roja");
		System.out.println(entityManagerFactory);
	}

}
