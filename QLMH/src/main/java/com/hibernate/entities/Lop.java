package com.hibernate.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Lop implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String Malop;
	private Set<SinhVien> sinhVien = new HashSet<SinhVien>(0);
	public Lop(String malop, Set<SinhVien> sinhVien) {
		super();
		Malop = malop;
		this.sinhVien = sinhVien;
	}
	public String getMalop() {
		return Malop;
	}
	public void setMalop(String malop) {
		Malop = malop;
	}
	public Set<SinhVien> getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(Set<SinhVien> sinhVien) {
		this.sinhVien = sinhVien;
	}
	
	
}
