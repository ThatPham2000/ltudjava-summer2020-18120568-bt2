package hibernate;

import java.util.List;

import org.hibernate.SessionFactory;

public class Main {
	static final SessionFactory factory = HibernateUtil.getSessionFactory();
	public static void main(String[] args)
	{
		
		List<SinhVienEntity> ds=SinhVienDAO.layDanhSachSinhVien();
		for(int i=0; i<ds.size(); i++){
		SinhVienEntity sv=ds.get(i);
		System.out.println("MSSV: "+sv.getMssv());
		System.out.println("Họ và tên: "+sv.getHoTen());
		System.out.println("Giới tính: " + sv.getGioiTinh());
		System.out.println("CMND: "+ sv.getCmnd());
		}
	}
}
