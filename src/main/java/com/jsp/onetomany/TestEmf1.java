package com.jsp.onetomany;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEmf1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("roja");
		System.out.println(entityManagerFactory);
	}

}
