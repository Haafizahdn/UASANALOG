import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class MenuMakanan {

	private JFrame frame;
	private JTextField txtjumlah1;
	private JTextField txtjumlah2;
	private JTextField txtjumlah3;
	private JTextField txtjumlah4;
	private JTextField txtjumlah5;
	private JTextField txtjumlah6;
	private JTextField txtjumlah7;
	private JTextField txtjumlah8;
	private JTextField txtjumlah9;
	
	int makanan;
	int minuman;
	
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMakanan window = new MenuMakanan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuMakanan() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.setBounds(100, 100, 688, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Makanan :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(10, 56, 87, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHarga = new JLabel("Harga :");
		lblHarga.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblHarga.setBounds(163, 56, 45, 22);
		frame.getContentPane().add(lblHarga);
		
		JLabel lblJumlah = new JLabel("Jumlah :");
		lblJumlah.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblJumlah.setBounds(263, 56, 50, 22);
		frame.getContentPane().add(lblJumlah);
		
		JLabel lblMenuMinuman = new JLabel("Menu Minuman :");
		lblMenuMinuman.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMenuMinuman.setBounds(359, 56, 87, 22);
		frame.getContentPane().add(lblMenuMinuman);
		
		JLabel lblHarga_1 = new JLabel("Harga :");
		lblHarga_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblHarga_1.setBounds(483, 56, 45, 22);
		frame.getContentPane().add(lblHarga_1);
		
		JLabel lblJumlah_1 = new JLabel("Jumlah :");
		lblJumlah_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblJumlah_1.setBounds(574, 56, 50, 22);
		frame.getContentPane().add(lblJumlah_1);
		
		JRadioButton cbxayampenyetneo = new JRadioButton("Ayam Penyet Neo");
		cbxayampenyetneo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxayampenyetneo.getSelectedObjects().toString().equals("Ayam Penyet Neo")) {
					makanan = 25000;
				}
			}
		});
		cbxayampenyetneo.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxayampenyetneo.setBounds(10, 84, 118, 23);
		frame.getContentPane().add(cbxayampenyetneo);
		
		JRadioButton cbxrotibakar = new JRadioButton("Roti Bakar");
		cbxrotibakar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxrotibakar.getSelectedObjects().toString().equals("Roti Bakar")) {
					 makanan = 10000;
				}
			}
		});
		cbxrotibakar.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxrotibakar.setBounds(10, 188, 97, 23);
		frame.getContentPane().add(cbxrotibakar);
		
		JRadioButton cbxkentanggoreng = new JRadioButton("Kentang Goreng");
		cbxkentanggoreng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxkentanggoreng.getSelectedObjects().toString().equals("Kentang Goreng")) {
					makanan = 10000;
				}
			}
			
		});
		cbxkentanggoreng.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxkentanggoreng.setBounds(10, 162, 105, 23);
		frame.getContentPane().add(cbxkentanggoreng);
		
		JRadioButton cbxayamtaliwangneo = new JRadioButton("Ayam Taliwang Neo");
		cbxayamtaliwangneo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxayamtaliwangneo.getSelectedObjects().toString().equals("Ayam Taliwang Neo")) {
					makanan = 25000;
				}
			}
		});
		cbxayamtaliwangneo.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxayamtaliwangneo.setBounds(10, 110, 125, 23);
		frame.getContentPane().add(cbxayamtaliwangneo);
		
		JRadioButton cbxnasigoreng = new JRadioButton("Nasi Goreng");
		cbxnasigoreng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxnasigoreng.getSelectedObjects().toString().equals("Nasi Goreng")) {
					makanan = 20000;
				}
			}
		});
		cbxnasigoreng.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxnasigoreng.setBounds(10, 136, 97, 23);
		frame.getContentPane().add(cbxnasigoreng);
		
		JRadioButton cbxcappucino = new JRadioButton("Cappucino");
		cbxcappucino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxcappucino.getSelectedObjects().toString().equals("Cappucino")) {
					minuman = 15000;
				}
			}
		});
		cbxcappucino.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxcappucino.setBounds(359, 81, 97, 23);
		frame.getContentPane().add(cbxcappucino);
		
		JRadioButton cbxtehes = new JRadioButton("Teh Es");
		cbxtehes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxtehes.getSelectedObjects().toString().equals("Teh Es")) {
					minuman = 10000;
				}
			}
		});
		cbxtehes.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxtehes.setBounds(359, 110, 97, 23);
		frame.getContentPane().add(cbxtehes);
		
		JRadioButton cbxkopipanas = new JRadioButton("Kopi Panas");
		cbxkopipanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxkopipanas.getSelectedObjects().toString().equals("Kopi Panas")) {
					minuman = 8000;
				}
			}
		});
		cbxkopipanas.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxkopipanas.setBounds(359, 136, 97, 23);
		frame.getContentPane().add(cbxkopipanas);
		
		JRadioButton cbxanekajus = new JRadioButton("Aneka Jus");
		cbxanekajus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxanekajus.getSelectedObjects().toString().equals("Aneka Jus")) {
					minuman = 12000;
				}
			}
		});
		cbxanekajus.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbxanekajus.setBounds(359, 162, 97, 23);
		frame.getContentPane().add(cbxanekajus);
		
		JLabel lblNewLabel_1 = new JLabel("NEO's CAFE");
		lblNewLabel_1.setFont(new Font("Univers LT Std 45 Light", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(266, 1, 132, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rp.25.000");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(163, 89, 62, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rp.25.000");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_1.setBounds(163, 114, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Rp.20.000");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(163, 140, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Rp.10.000");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_3.setBounds(163, 166, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Rp.10.000");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_3_1.setBounds(163, 192, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Rp.15.000");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_3_2.setBounds(483, 85, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Rp.10.000");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_3_3.setBounds(483, 114, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("Rp. 8.000");
		lblNewLabel_2_3_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_3_4.setBounds(483, 140, 51, 14);
		frame.getContentPane().add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_3_5 = new JLabel("Rp.12.000");
		lblNewLabel_2_3_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_3_5.setBounds(483, 166, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_3_5);
		
		txtjumlah1 = new JTextField();
		txtjumlah1.setBounds(263, 84, 50, 20);
		frame.getContentPane().add(txtjumlah1);
		txtjumlah1.setColumns(10);
		
		txtjumlah2 = new JTextField();
		txtjumlah2.setColumns(10);
		txtjumlah2.setBounds(263, 111, 50, 20);
		frame.getContentPane().add(txtjumlah2);
		
		txtjumlah3 = new JTextField();
		txtjumlah3.setColumns(10);
		txtjumlah3.setBounds(263, 137, 50, 20);
		frame.getContentPane().add(txtjumlah3);
		
		txtjumlah4 = new JTextField();
		txtjumlah4.setColumns(10);
		txtjumlah4.setBounds(263, 163, 50, 20);
		frame.getContentPane().add(txtjumlah4);
		
		txtjumlah5 = new JTextField();
		txtjumlah5.setColumns(10);
		txtjumlah5.setBounds(262, 189, 51, 20);
		frame.getContentPane().add(txtjumlah5);
		
		txtjumlah6 = new JTextField();
		txtjumlah6.setColumns(10);
		txtjumlah6.setBounds(574, 82, 50, 20);
		frame.getContentPane().add(txtjumlah6);
		
		txtjumlah7 = new JTextField();
		txtjumlah7.setColumns(10);
		txtjumlah7.setBounds(574, 111, 50, 20);
		frame.getContentPane().add(txtjumlah7);
		
		txtjumlah8 = new JTextField();
		txtjumlah8.setColumns(10);
		txtjumlah8.setBounds(574, 137, 50, 20);
		frame.getContentPane().add(txtjumlah8);
		
		txtjumlah9 = new JTextField();
		txtjumlah9.setColumns(10);
		txtjumlah9.setBounds(574, 163, 50, 20);
		frame.getContentPane().add(txtjumlah9);
		
		JLabel lblNewLabel_3 = new JLabel("Menu yang Dipesan :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(75, 240, 118, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextArea txapesan = new JTextArea();
		txapesan.setBounds(214, 235, 364, 169);
		frame.getContentPane().add(txapesan);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtjumlah1.setText("");
				txtjumlah2.setText("");
				txtjumlah3.setText("");
				txtjumlah4.setText("");
				txtjumlah5.setText("");
				txtjumlah6.setText("");
				txtjumlah7.setText("");
				txtjumlah8.setText("");
				txtjumlah9.setText("");
				txapesan.setText("");
			}
			
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnReset.setBounds(420, 415, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnPesan = new JButton("Pesan");
		btnPesan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil;
				tampil = "";
				int bayar = 0;
				if (cbxayampenyetneo.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah1.getText());
					int total;
					total=jumlah*25000;
					bayar=bayar+total;
					tampil +=cbxayampenyetneo.getText()+ "Rp. 25.000"+" x "+jumlah+" = "+total+"\n";
				}if (cbxayamtaliwangneo.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah2.getText());
					int total;
					total=jumlah*25000;
					bayar=bayar+total;
					tampil +=cbxayamtaliwangneo.getText()+ "Rp. 25.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxnasigoreng.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah3.getText());
					int total;
					total=jumlah*20000;
					bayar=bayar+total;
					tampil +=cbxnasigoreng.getText()+ "Rp. 20.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxkentanggoreng.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah4.getText());
					int total;
					total=jumlah*10000;
					bayar=bayar+total;
					tampil +=cbxkentanggoreng.getText()+ "Rp. 10.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxrotibakar.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah5.getText());
					int total;
					total=jumlah*10000;
					bayar=bayar+total;
					tampil +=cbxrotibakar.getText()+"Rp. 10.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxcappucino.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah6.getText());
					int total;
					total=jumlah*15000;
					bayar=bayar+total;
					tampil +=cbxcappucino.getText()+ "Rp. 15.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxtehes.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah7.getText());
					int total;
					total=jumlah*10000;
					bayar=bayar+total;
					tampil +=cbxtehes.getText()+ "Rp. 10.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxkopipanas.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah8.getText());
					int total;
					total=jumlah*8000;
					bayar=bayar+total;
					tampil += cbxkopipanas.getText()+ "Rp. 8.000"+" x "+jumlah+" = "+total+"\n";
			   }if (cbxanekajus.isSelected()) {
					int jumlah=Integer.parseInt(txtjumlah9.getText());
					int total;
					total=jumlah*12000;
					bayar=bayar+total;
					tampil +=cbxanekajus.getText()+ "Rp. 12.000"+" x "+jumlah+" = "+total+"\n";
					
			  }	
			   
			   txapesan.setText(tampil+"============================="+"\n"+"Total Bayar ="+ bayar);
			}
			
		});
		btnPesan.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPesan.setBounds(266, 415, 89, 23);
		frame.getContentPane().add(btnPesan);
		
	
		
	
}
}
						
