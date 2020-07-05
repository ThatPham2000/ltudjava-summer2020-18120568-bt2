package hibernate;
import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
public class LopDAO {
	public static List<LopEntity> layDanhSach() {
		List<LopEntity> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "select sv from LopEntity sv";
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
	
	public static LopEntity layThongTinLop(String maLop) {
		LopEntity lop = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			lop = (LopEntity) session.get(LopEntity.class, maLop);
		} catch (HibernateException ex) {
			// Log the exception
			System.err.println(ex);
		} finally {
			session.close();
		}
		return lop;
	}
	
	public static boolean themLop(LopEntity lop) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		if (LopDAO.layThongTinLop(lop.getMaLop())!=null) {
			return false;
		}
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(lop);
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
