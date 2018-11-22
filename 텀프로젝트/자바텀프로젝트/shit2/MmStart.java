package shit2;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class MmStart extends MyFrame{
	public JButton bt1 = new JButton("몸무게관리");
	public JButton bt2 = new JButton("음식칼로리사전");
	public JButton bt3 = new JButton("운동칼로리사전");
	public JButton bt4 = new JButton("추천운동법");
	public JButton bt5 = new JButton("Logout");
	public JButton bt6 = new JButton("Ver.");
	
	private static final long serialVersionUID = 1L;
		MyFrame frame = new MyFrame();
		MyActionListener listener = new MyActionListener();
		public void MmStart() {
			// TODO Auto-generated method stub
			JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\lee\\Desktop\\묶어놓은거\\묶어놓은거\\src\\start.jpg"));
			lblNewLabel.setBounds(90, 38, 450, 200);
			frame.getContentPane().add(lblNewLabel);
			
			frame.setTitle("DietHelper");
			frame.setSize(650, 360);
			frame.setLocation(500, 300);
			frame.setVisible(true);
			
			bt1.addActionListener(listener);
			bt1.setBounds(22, 245, 133, 49);
			frame.getContentPane().add(bt1);
			bt2.addActionListener(listener);
			bt2.setBounds(174, 245, 133, 49);
			frame.getContentPane().add(bt2);
			bt3.addActionListener(listener);
			bt3.setBounds(324, 245, 133, 49);
			frame.getContentPane().add(bt3);
			bt4.addActionListener(listener);
			bt4.setBounds(474, 245, 133, 49);
			frame.getContentPane().add(bt4);
			bt5.addActionListener(listener);
			bt5.setBounds(470, 5, 80, 25);
			frame.getContentPane().add(bt5);
			bt6.addActionListener(listener);
			bt6.setBounds(555, 5, 60, 25);
			frame.getContentPane().add(bt6);			
		}
	}


class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Logout")){
			StartPage start = new StartPage();
			
		}
		if(e.getActionCommand().equals("몸무게관리")){
			Test.getInstance();
//			Main1.getInstance();
		}
		if(e.getActionCommand().equals("Ver.")){
			Version ver = new Version();
		}
		if(e.getActionCommand().equals("음식칼로리사전")){
			FoodDiction food = new FoodDiction();
		}
		if(e.getActionCommand().equals("운동칼로리사전")){
			SportsDiction sport = new SportsDiction();
		}
		if(e.getActionCommand().equals("추천운동법")){
			MemberSearch search = new MemberSearch();
		}
	}
}

	@SuppressWarnings("serial")
class Version extends Frame {									//만든이 메소드
	MyFrame frame2 = new MyFrame();
	
	public Version()
	{
		frame2.setTitle("Version");
		frame2.setSize(300, 250);
		frame2.setLocation(300, 250);
		frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JButton bt7 = new JButton("Close");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
			}
		});
		bt7.setBounds(200,10, 70, 25);
		frame2.getContentPane().add(bt7);
		
		JLabel lblNewLabel = new JLabel("<제작자> ");
		lblNewLabel.setBounds(20, 20, 160, 27);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("이혜림      권현지      임주영      태현지");
		label.setBounds(20, 50, 300, 27);
		frame2.getContentPane().add(label);
		
		JLabel label_1 = new JLabel( "<프로그램 버전>");
		label_1.setBounds(20, 90, 160, 27);
		frame2.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel( "Version.1.0");
		label_2.setBounds(20, 120, 160, 27);
		frame2.getContentPane().add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("경북대학교 전자공학부");
		lblNewLabel_1.setBounds(120, 160, 145, 15);
		
		frame2.getContentPane().add(lblNewLabel_1);
		frame2.setVisible(true);
	}
	}
