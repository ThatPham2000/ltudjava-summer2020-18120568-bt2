public class Main {
	static final SessionFactory factory = HibernateUtils.getSessionFactory();
	public static void main(String[] args)
	{
		List<SinhVien> ds=SinhVienDAO.layDanhSachSinhVien();
		for(int i=0; i<ds.size(); i++){
		SinhVien sv=ds.get(i);
		System.out.println("MSSV: "+sv.getMaSV());
		System.out.println("Họ và tên: "+sv.getTenSV());
		System.out.println("Diem: " + sv.getDiem());
		System.out.println("BM: "+ sv.getMaBM());
		}
	}
}
