package com.hibernate.entities;

import java.io.Serializable;

public class TKB implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String MaMon;
	private String TenMon;
	private String PhongHoc;
	public String getMaMon() {
		return MaMon;
	}
	public void setMaMon(String maMon) {
		MaMon = maMon;
	}
	public String getTenMon() {
		return TenMon;
	}
	public void setTenMon(String tenMon) {
		TenMon = tenMon;
	}
	public String getPhongHoc() {
		return PhongHoc;
	}
	public void setPhongHoc(String phongHoc) {
		PhongHoc = phongHoc;
	}
	
}
