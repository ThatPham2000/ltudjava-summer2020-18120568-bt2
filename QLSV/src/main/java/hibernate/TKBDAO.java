package hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TKBDAO {
	public static List<TkbEntity> layDanhSachTKB() {
		List<TkbEntity> ds = null;
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
	
	

	public static TkbEntity layThongTintkb(String mamon) {
		TkbEntity sv = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			sv = (TkbEntity) session.get(TkbEntity.class, mamon);
		} catch (HibernateException ex) {
			// Log the exception
			System.err.println(ex);
		} finally {
			session.close();
		}
		return sv;
	}

	public static boolean themTKB(TkbEntity sv) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (TKBDAO.layThongTintkb(sv.getMaMon())!=null) {
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

	public static boolean capNhatThongTinTKB(TkbEntity sv) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (TKBDAO.layThongTintkb(sv.getMaMon())!=null) {
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

	
}
