package com.jsp.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ATM {
	@Id
	private int id;
	private long num;
	private int cvv;
	@ManyToOne
	@JoinColumn
	private Person2 p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Person2 getP() {
		return p;
	}
	public void setP(Person2 p) {
		this.p = p;
	}
	
	
	

}
