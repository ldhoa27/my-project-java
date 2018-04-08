package MANG;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai4 frame = new bai4();
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
	public bai4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhapVaoSo = new JLabel("Nhap vao so tu nhien N");
		lblNhapVaoSo.setForeground(Color.GREEN);
		lblNhapVaoSo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNhapVaoSo.setBounds(49, 56, 174, 14);
		contentPane.add(lblNhapVaoSo);
		
		txtN = new JTextField();
		txtN.setBounds(233, 54, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JButton btnTinhTong = new JButton("Tinh tong");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int N =Integer.parseInt(txtN.getText());
				int s=0;
				for(int i=0;i<=N;i++) {
					s=s+i;
				}
				txtS.setText( String.valueOf(s));
			}
		});
		btnTinhTong.setForeground(Color.GREEN);
		btnTinhTong.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTinhTong.setBounds(335, 53, 99, 23);
		contentPane.add(btnTinhTong);
		
		JLabel lblKetQuaDoc = new JLabel("Ket qua doc so");
		lblKetQuaDoc.setForeground(Color.GREEN);
		lblKetQuaDoc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKetQuaDoc.setBounds(49, 93, 115, 14);
		contentPane.add(lblKetQuaDoc);
		
		JLabel lblS = new JLabel("S");
		lblS.setForeground(Color.BLUE);
		lblS.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblS.setBounds(53, 134, 46, 14);
		contentPane.add(lblS);
		
		txtS = new JTextField();
		txtS.setBounds(123, 131, 301, 20);
		contentPane.add(txtS);
		txtS.setColumns(10);
		
		JLabel lblBai = new JLabel("Bai 5");
		lblBai.setForeground(Color.RED);
		lblBai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBai.setBounds(22, 11, 46, 14);
		contentPane.add(lblBai);
	}

}

