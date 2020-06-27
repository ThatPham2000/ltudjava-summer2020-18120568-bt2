package com.hibernate.entities;

import java.io.Serializable;

public class Lop implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String Malop;
	public String getMalop() {
		return Malop;
	}
	public void setMalop(String malop) {
		Malop = malop;
	}
	
}
