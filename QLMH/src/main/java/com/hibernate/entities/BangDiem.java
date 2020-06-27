package com.hibernate.entities;

import java.io.Serializable;

public class BangDiem implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String MaLop;
	private String MaMon;
	private String MSSV;
	private double DiemGK;
	private double DiemCK;
	private double DiemKhac;
	private double DiemTong;
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
	public double getDiemGK() {
		return DiemGK;
	}
	public void setDiemGK(double diemGK) {
		DiemGK = diemGK;
	}
	public double getDiemCK() {
		return DiemCK;
	}
	public void setDiemCK(double diemCK) {
		DiemCK = diemCK;
	}
	public double getDiemKhac() {
		return DiemKhac;
	}
	public void setDiemKhac(double diemKhac) {
		DiemKhac = diemKhac;
	}
	public double getDiemTong() {
		return DiemTong;
	}
	public void setDiemTong(double diemTong) {
		DiemTong = diemTong;
	}
	
}
