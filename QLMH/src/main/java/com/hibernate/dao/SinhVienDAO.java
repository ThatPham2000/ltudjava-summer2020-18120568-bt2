package com.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.entities.*;
import com.hibernate.utils.HibernateUtils;

public class SinhVienDAO {
	public static List<SinhVien> layDanhSachSinhVien() {
		List<SinhVien> ds = null;
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			String hql = "select sv from SinhVien sv";
			Query query = session.createQuery(hql);
			ds = query.list();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			System.err.println(ex);
		} finally {
			session.close();
		}
		return ds;
	}
}