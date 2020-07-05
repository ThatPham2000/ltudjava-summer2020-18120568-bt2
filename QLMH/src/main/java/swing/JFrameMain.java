package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
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
	public JFrameMain() {
		setTitle("Quản lý Sinh viên và môn học");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JButton buttonimportlop = new JButton("Import DS Lop");
		buttonimportlop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonimportlop.setBounds(10, 27, 119, 23);
		desktopPane.add(buttonimportlop);
		
		JButton buttonthemsv = new JButton("Thêm Một SV");
		buttonthemsv.setBounds(10, 70, 119, 23);
		desktopPane.add(buttonthemsv);
		
		JButton buttonimporttkb = new JButton("Import TKB");
		buttonimporttkb.setBounds(10, 114, 119, 23);
		desktopPane.add(buttonimporttkb);
		
		JButton buttondskhoahoc = new JButton("DS Khóa học");
		buttondskhoahoc.setBounds(10, 160, 119, 23);
		desktopPane.add(buttondskhoahoc);
	}
}
