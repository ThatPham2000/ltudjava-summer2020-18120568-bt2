package hibernate;

import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class KhoaHocDAO {
	public static List<KhoaHocEntity> layDanhSachKhoaHoc() {
		List<KhoaHocEntity> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "select sv from KhoaHocEntity sv";
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

	public static KhoaHocEntity layThongTinKhoaHoc(String maLop) {
		KhoaHocEntity kh = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			kh = (KhoaHocEntity) session.get(KhoaHocEntity.class, maLop);
		} catch (HibernateException ex) {
			// Log the exception
			System.err.println(ex);
		} finally {
			session.close();
		}
		return kh;
	}

	public static boolean themKhoaHoc(KhoaHocEntity kh) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (KhoaHocDAO.layThongTinKhoaHoc(kh.getMaLop()) != null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(kh);
			transaction.commit();
		} catch (HibernateException ex) {
			// Log the exception
			transaction.rollback();
			System.err.println(ex);
		} finally {
			session.close();
		}
		return true;
	}

	public static boolean capNhatThongTinKhoaHoc(KhoaHocEntity kh) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (KhoaHocDAO.layThongTinKhoaHoc(kh.getMaLop()) != null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(kh);
			transaction.commit();
		} catch (HibernateException ex) {
			// Log the exception
			transaction.rollback();
			System.err.println(ex);
		} finally {
			session.close();
		}
		return true;
	}

	public static boolean xoaKhoaHoc(String maLop) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		KhoaHocEntity kh = KhoaHocDAO.layThongTinKhoaHoc(maLop);
		if (kh == null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(kh);
			transaction.commit();
		} catch (HibernateException ex) {
			// Log the exception
			transaction.rollback();
			System.err.println(ex);
		} finally {
			session.close();
		}
		return true;
	}
}
