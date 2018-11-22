package shit2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class StartPage extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public StartPage() {
		setVisible(true);
		setTitle("DietHelper");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 360);
		setLocation(500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(371, 67, 43, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblPassword.setBounds(339, 119, 88, 40);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lee\\Desktop\\\uBB36\uC5B4\uB193\uC740\uAC70\\\uBB36\uC5B4\uB193\uC740\uAC70\\src\\start.jpg"));
		lblNewLabel_1.setBounds(27, 30, 279, 250);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBounds(441, 78, 164, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 18));
		passwordField.setBounds(441, 128, 164, 24);
		contentPane.add(passwordField);
		
		JButton button = new JButton("로그인");
		button.setBounds(450, 184, 105, 40);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {	
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			public void actionPerformed(ActionEvent e) {
				MmStart mm = new MmStart();
				mm.MmStart();
			}
		});
//		
//		JButton button_1 = new JButton("회원가입");
//		button_1.setBounds(490, 184, 105, 40);
//		contentPane.add(button_1);
//		button.addActionListener(new ActionListener() {				//회원가입 넘어가는창 안했음~~!~~~~~~~~~~~~~~~~~
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
	}	
}