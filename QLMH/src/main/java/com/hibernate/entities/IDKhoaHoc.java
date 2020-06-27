package com.hibernate.entities;

import java.io.Serializable;

public class IDKhoaHoc implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String MaLop;
	private String MaMon;
	public String getMaLop() {
		return MaLop;
	}
	public void setMaLop(String maLop) {
		MaLop = maLop;
	}
	public String getMaMon() {
		return MaMon;
	}
	public void setMaMon(String maMon) {
		MaMon = maMon;
	}
	
}
