package hibernate;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField textmalop;
	private JButton importdslop;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField textlink;
	private JLabel kqthem;
	private JLabel lblThm;
	private JLabel lblNewLabel_3;
	private JTextField textlop;
	private JTextField textms;
	private JTextField textten;
	private JTextField textgt;
	private JTextField textcmnd;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;
	private JLabel kqthem2;
	private JLabel lblInDanh;
	private JTable table1;
	private JLabel lblNewLabel_8;
	private JTextField textmalopin;
	private JButton buttonin;
	private JLabel lblImportTkb;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JTextField textField1;
	private JTextField textField2;
	private JButton imtkb;
	private JLabel kqthem3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jFrameMain frame = new jFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jFrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		importdslop = new JButton("ImportDSLop");
		importdslop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					List<SinhVienEntity> ds = new ArrayList<SinhVienEntity>();
					FileReaderCSV.ReadCSV(textlink.getText(), ds);
					
					LopEntity l = new LopEntity();
					l.setMaLop(textmalop.getText());
					
					LopDAO.themLop(l);
					
					for(int i = 0; i < ds.size(); i++)
					{
						ds.get(i).setMaLop(textmalop.getText());
					}
					for(SinhVienEntity sv: ds)
					{
						System.out.println(sv.toString());
					}
					
					for(int i = 0; i < ds.size(); i++)
					{
						SinhVienDAO.themSinhVien(ds.get(i));
					}
					kqthem.setText("Đã thêm.");
				} catch (Exception e2) {
					kqthem.setText("Bị lỗi.");
				}
			}
		});
		importdslop.setBounds(138, 89, 111, 23);
		contentPane.add(importdslop);
		
		lblNewLabel = new JLabel("1. Import DS Lớp");
		lblNewLabel.setBounds(10, 11, 97, 14);
		contentPane.add(lblNewLabel);
		
		textmalop = new JTextField();
		textmalop.setBounds(138, 33, 159, 20);
		contentPane.add(textmalop);
		textmalop.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nhập mã lớp:");
		lblNewLabel_1.setBounds(32, 36, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nhập đường dẫn:");
		lblNewLabel_2.setBounds(32, 64, 99, 14);
		contentPane.add(lblNewLabel_2);
		
		textlink = new JTextField();
		textlink.setColumns(10);
		textlink.setBounds(138, 61, 159, 20);
		contentPane.add(textlink);
		
		kqthem = new JLabel("");
		kqthem.setBounds(258, 92, 97, 23);
		contentPane.add(kqthem);
		
		lblThm = new JLabel("2. Thêm 1 SV");
		lblThm.setBounds(10, 132, 97, 14);
		contentPane.add(lblThm);
		
		lblNewLabel_3 = new JLabel("Nhập mã lớp:");
		lblNewLabel_3.setBounds(32, 157, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		textlop = new JTextField();
		textlop.setColumns(10);
		textlop.setBounds(138, 154, 159, 20);
		contentPane.add(textlop);
		
		textms = new JTextField();
		textms.setColumns(10);
		textms.setBounds(138, 185, 159, 20);
		contentPane.add(textms);
		
		textten = new JTextField();
		textten.setColumns(10);
		textten.setBounds(138, 217, 159, 20);
		contentPane.add(textten);
		
		textgt = new JTextField();
		textgt.setColumns(10);
		textgt.setBounds(138, 249, 159, 20);
		contentPane.add(textgt);
		
		textcmnd = new JTextField();
		textcmnd.setColumns(10);
		textcmnd.setBounds(138, 280, 159, 20);
		contentPane.add(textcmnd);
		
		lblNewLabel_4 = new JLabel("Nhập MSSV:");
		lblNewLabel_4.setBounds(32, 188, 75, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Nhập họ tên:");
		lblNewLabel_5.setBounds(32, 220, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Nhập giới tính:");
		lblNewLabel_6.setBounds(32, 252, 75, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Nhập CMND:");
		lblNewLabel_7.setBounds(32, 283, 75, 14);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LopEntity l = new LopEntity();
					l.setMaLop(textmalop.getText());
					LopDAO.themLop(l);
					
					SinhVienEntity sv = new SinhVienEntity();
					sv.setMaLop(textlop.getText());
					sv.setHoTen(textten.getText());
					sv.setMssv(textms.getText());
					sv.setGioiTinh(textgt.getText());
					sv.setCmnd(textcmnd.getText());
					SinhVienDAO.themSinhVien(sv);
					kqthem2.setText("Đã thêm");
				} catch (Exception e2) {
					kqthem2.setText("Bị lỗi");
				}
			}
		});
		btnNewButton.setBounds(138, 311, 89, 23);
		contentPane.add(btnNewButton);
		
		kqthem2 = new JLabel("");
		kqthem2.setBounds(258, 311, 97, 23);
		contentPane.add(kqthem2);
		
		lblInDanh = new JLabel("3. In danh sách lớp");
		lblInDanh.setBounds(10, 351, 108, 14);
		contentPane.add(lblInDanh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 412, 386, 306);
		contentPane.add(scrollPane);
		
		table1 = new JTable();
		scrollPane.setColumnHeaderView(table1);
		
		lblNewLabel_8 = new JLabel("Nhập mã lớp:");
		lblNewLabel_8.setBounds(32, 376, 75, 14);
		contentPane.add(lblNewLabel_8);
		
		textmalopin = new JTextField();
		textmalopin.setColumns(10);
		textmalopin.setBounds(138, 373, 159, 20);
		contentPane.add(textmalopin);
		
		buttonin = new JButton("Go");
		buttonin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("STT");
				model.addColumn("MSSV");
				model.addColumn("Họ Tên");
				model.addColumn("Giới tính");
				model.addColumn("CMND");
				model.addColumn("Mã lớp");
				
				List<SinhVienEntity> ds = SinhVienDAO.layDanhSachSinhVienThoa(textmalopin.getText());
				int stt = 0;
				for(SinhVienEntity sv: ds)
				{
					model.addRow(new Object[] {stt, sv.getMssv(), sv.getHoTen(), sv.getGioiTinh(), sv.getCmnd(), sv.getMaLop()});
					stt++;
				}
				
				
				
				table1.setModel(model);
			}
		});
		buttonin.setBounds(308, 371, 89, 23);
		contentPane.add(buttonin);
		
		lblImportTkb = new JLabel("4. Import TKB");
		lblImportTkb.setBounds(457, 11, 97, 14);
		contentPane.add(lblImportTkb);
		
		lblNewLabel_10 = new JLabel("Nhập mã lớp:");
		lblNewLabel_10.setBounds(479, 36, 75, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Nhập đường dẫn:");
		lblNewLabel_11.setBounds(479, 64, 99, 14);
		contentPane.add(lblNewLabel_11);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(592, 33, 159, 20);
		contentPane.add(textField1);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(592, 61, 159, 20);
		contentPane.add(textField2);
		
		imtkb = new JButton("ImportTKB");
		imtkb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					List<TkbEntity> ds  = new ArrayList<TkbEntity>();
					ReadFileCSVTKB.ReadCSV(textField2.getText(), ds);
					
					KhoaHocEntity kh = new KhoaHocEntity();
					for(TkbEntity tkb: ds)
					{
						kh.setMaLop(textField1.getText());
						kh.setMaMon(tkb.getMaMon());
						for(SinhVienEntity sv: SinhVienDAO.layDanhSachSinhVien())
						{
							kh.setMssv(sv.getMssv());
							KhoaHocDAO.themKhoaHoc(kh);
						}
						
					}
					for(TkbEntity tkb: ds)
					{
						TKBDAO.themTKB(tkb);
					}
					kqthem3.setText("Đã thêm.");
				} catch (Exception e2) {
					// TODO: handle exception
					kqthem3.setText("Bị lỗi");
				}
				
			}
		});
		imtkb.setBounds(592, 92, 111, 23);
		contentPane.add(imtkb);
		
		kqthem3 = new JLabel("");
		kqthem3.setBounds(708, 93, 97, 23);
		contentPane.add(kqthem3);
		
		//loadData();
	}
	
	private void loadData()
	{
//		DefaultTableModel model = new DefaultTableModel();
//		model.addColumn("STT");
//		model.addColumn("MSSV");
//		model.addColumn("Họ Tên");
//		model.addColumn("Giới tính");
//		model.addColumn("CMND");
//		model.addColumn("Mã lớp");
//		
//		List<SinhVienEntity> ds = SinhVienDAO.layDanhSachSinhVienThoa(textmalopin.getText());
//		int stt = 0;
//		for(SinhVienEntity sv: ds)
//		{
//			model.addRow(new Object[] {stt, sv.getMssv(), sv.getHoTen(), sv.getGioiTinh(), sv.getCmnd(), sv.getMaLop()});
//			stt++;
//		}
//		
//		
//		
//		table1.setModel(model);
	}
}
