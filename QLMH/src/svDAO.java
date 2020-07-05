
public class svDAO {
	public static List<SinhVien> layDanhSachSinhVien() {
		List<SinhVien> ds = null;
		Session session = HibernateUtils.getSessionFactory()
		.openSession();
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
