package com.hibernate.entities;

import java.io.Serializable;

public class KhoaHoc implements Serializable
{
	private static final long serialVersionUID = 1L;
	private IDKhoaHoc idKhoaHoc;
	private String MSSV;
	public IDKhoaHoc getIdKhoaHoc() {
		return idKhoaHoc;
	}
	public void setIdKhoaHoc(IDKhoaHoc idKhoaHoc) {
		this.idKhoaHoc = idKhoaHoc;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public KhoaHoc(IDKhoaHoc idKhoaHoc, String mSSV) {
		super();
		this.idKhoaHoc = idKhoaHoc;
		MSSV = mSSV;
	}
	
	
}
