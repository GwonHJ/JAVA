package shit2;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame{
	private static final long serialVersionUID = 1L;
	private static Test instance = new Test();
	public static Test getInstance() {
		return instance;
	}

	JPanel jp = new JPanel();
	JLabel jl1 = new JLabel("个公霸(kg)"); 
	JLabel jl2 = new JLabel("虐(cm)");
	JButton jb1 = new JButton("涝仿");  
	JButton jb2 = new JButton("秒家");
	JTextField tf1, tf2;
	JMenuBar  menuBar = new JMenuBar(); 
	JMenu menu = new JMenu("个公霸 包府");
	
	DataBase db = new DataBase();
	
	public Test(){
		super("DietHelper");
		displayWindows();
	}
	
	public void readFile() {
		
	}
	
	public void displayWindows() {
		jp.setLayout(null);
		
		menuBar.setBorder(BorderFactory.createLineBorder(Color.gray)); 
		menuBar.add(menu);
		setJMenuBar(menuBar);
	
		tf1 = new JTextField(10); 
		tf2 = new JTextField(10);
		
		jl1.setBounds(100, 100, 80, 40);
		jl2.setBounds(100, 200, 80, 40);
		tf1.setBounds(200, 100, 100, 40);
		tf2.setBounds(200, 200, 100, 40);
		jb1.setBounds(80, 360, 80, 40);  
		jb2.setBounds(220, 360, 80, 40);

		MyListener listner = new MyListener(db);
		jb1.addActionListener(listner);
		jb2.addActionListener(listner);
			
		jp.add(jl1); 
		jp.add(tf1); 
		jp.add(jl2);
		jp.add(tf2);
		jp.add(jb1);
		jp.add(jb2);
		add(jp); 
		
		
		setSize(400, 500); 
		setVisible(true);
		
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}

