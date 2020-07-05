package hibernate;

import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class SinhVienDAO {
	public static List<SinhVienEntity> layDanhSachSinhVien() {
		List<SinhVienEntity> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "select sv from SinhVienEntity sv";
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
	
	public static List<SinhVienEntity> layDanhSachSinhVienThoa(String malop) {
		List<SinhVienEntity> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from SinhVienEntity sv where sv.maLop = :ml";
			ds = session.createQuery(hql, SinhVienEntity.class).setParameter("ml", malop).list();
			//Query query = session.createQuery(hql);
			//ds = query.list();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			System.err.println(ex);
		} finally {
			session.close();
		}
		return ds;
	}

	public static SinhVienEntity layThongTinSinhVien(String maSinhVien) {
		SinhVienEntity sv = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			sv = (SinhVienEntity) session.get(SinhVienEntity.class, maSinhVien);
		} catch (HibernateException ex) {
			// Log the exception
			System.err.println(ex);
		} finally {
			session.close();
		}
		return sv;
	}

	public static boolean themSinhVien(SinhVienEntity sv) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (SinhVienDAO.layThongTinSinhVien(sv.getMssv()) != null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(sv);
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

	public static boolean capNhatThongTinSinhVien(SinhVienEntity sv) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (SinhVienDAO.layThongTinSinhVien(sv.getMssv()) == null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(sv);
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

	public static boolean xoaSinhVien(String maSinhVien) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		SinhVienEntity sv = SinhVienDAO.layThongTinSinhVien(maSinhVien);
		if (sv == null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(sv);
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
