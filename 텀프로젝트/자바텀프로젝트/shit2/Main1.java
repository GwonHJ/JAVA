package shit2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Main1 extends JFrame {
	private static Main1 instance = null;
	public static Main1 getInstance() {
		if (instance == null) instance = new Main1();
		
		return instance;
	}

	JMenu menu;
	JMenuBar menuBar;
	JMenuItem ExitItem;
	JPanel panel;
	JTextArea testArea;
	JButton a,b,c;
	TestListenr listener;

 public Main1(){
	 setLayout(null);  
	 CreateMenu(); 
	 CreatePanel();
	 setTitle("DietHelper");
//	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(300,250,400, 500);
	 setVisible(true); 
 }
 
 private void CreateMenu() {
  
	 menuBar = new JMenuBar(); 
	 menu = new JMenu("몸무게 관리"); 
	 menuBar.add(menu);
	 ExitItem = new JMenuItem("종료");
	 menu.add(ExitItem); 
	 menuBar.setBorder(BorderFactory.createLineBorder(Color.gray)); 
  
	 listener = new TestListenr(); 
	 ExitItem.addActionListener(listener); 
  
	 setJMenuBar(menuBar);
 }
 
 private void CreatePanel() {
  
	 panel = new JPanel(); 
	 panel.setLayout(null); 
	 panel.setBounds(0, 0, 400, 600); 
  	
	 testArea = new JTextArea();
	 testArea.setBounds(40, 50, 300, 300); 
	 testArea.setEditable(false);
  

	  a = new JButton("수정"); 
	  c = new JButton("취소");
	  a.setBounds(80, 360, 80, 40);
	  c.setBounds(220, 360, 80, 40);
	  
	  panel.add(testArea); 
	  panel.add(a); 
	  panel.add(c);
	  
	  add(panel);  
  
 }
 
 class TestListenr implements ActionListener {
  
  public void actionPerformed(ActionEvent event) {
   if (event.getSource() == ExitItem) {  
    System.exit(1);  
   } 
  }
 }
}

