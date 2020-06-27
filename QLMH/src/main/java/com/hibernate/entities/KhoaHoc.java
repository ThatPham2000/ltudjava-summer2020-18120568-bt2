package com.hibernate.entities;

import java.io.Serializable;

public class KhoaHoc implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String MaLop;
	private String MaMon;
	private String MSSV;
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
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	
}
