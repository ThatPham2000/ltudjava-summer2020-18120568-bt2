package swing;

import java.util.List;

import org.hibernate.SessionFactory;

import com.hibernate.dao.SinhVienDAO;
import com.hibernate.entities.SinhVien;
import com.hibernate.utils.HibernateUtils;

public class Main {
	static final SessionFactory factory = HibernateUtils.getSessionFactory();
	public static void main(String[] args)
	{
		
		List<SinhVien> ds=SinhVienDAO.layDanhSachSinhVien();
		for(int i=0; i<ds.size(); i++){
		SinhVien sv=ds.get(i);
		System.out.println("MSSV: "+sv.getMSSV());
		System.out.println("Họ và tên: "+sv.getHoTen());
		
		}
	}
}
