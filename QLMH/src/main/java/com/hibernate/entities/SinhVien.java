package com.hibernate.entities;

import java.io.Serializable;

public class SinhVien implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String MSSV;
	private String HoTen;
	private String GioiTinh;
	private String CMND;
	private Lop lop;
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public SinhVien(String mSSV, String hoTen, String gioiTinh, String cMND, Lop lop) {
		super();
		MSSV = mSSV;
		HoTen = hoTen;
		GioiTinh = gioiTinh;
		CMND = cMND;
		this.lop = lop;
	}
	
	
	
	
}
