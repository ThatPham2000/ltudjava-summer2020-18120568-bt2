package com.hibernate.entities;

import java.io.Serializable;

public class BangDiem implements Serializable
{
	private static final long serialVersionUID = 1L;
	private IDBangDiem idBangDiem;
	private double DiemGK;
	private double DiemCK;
	private double DiemKhac;
	private double DiemTong;
	public IDBangDiem getIdBangDiem() {
		return idBangDiem;
	}
	public void setIdBangDiem(IDBangDiem idBangDiem) {
		this.idBangDiem = idBangDiem;
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
	public BangDiem(IDBangDiem idBangDiem, double diemGK, double diemCK, double diemKhac, double diemTong) {
		super();
		this.idBangDiem = idBangDiem;
		DiemGK = diemGK;
		DiemCK = diemCK;
		DiemKhac = diemKhac;
		DiemTong = diemTong;
	}
	
}
