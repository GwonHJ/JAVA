package shit2;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class MemberSearch extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	public MemberSearch() {
		setVisible(true);
		setTitle(" DietHelper");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 12, 958, 51);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("추 천 운 동 법");
		JLabel lblNewLabel2 = new JLabel("원 하 는   운 동 을   영 상 으 로   보 려 면   링 크 를   클 릭 하 세 요");
		lblNewLabel.setBounds(430, 10, 215, 20);
		lblNewLabel2.setBounds(320, 30, 450, 20);
		lblNewLabel.setFont(new Font("문체부 제목 바탕체", Font.BOLD, 20));
		panel.add(lblNewLabel);
		panel.add(lblNewLabel2);
		contentPane.setLayout(null);
		contentPane.add(panel);
	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(12, 69, 958, 570);
		contentPane.add(tabbedPane);
		
		////////////////////////////////////////////////////////////////////////////////////////////
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("전  신", null, scrollPane, null);
		
		table = new JTable();
		table.setRowHeight(32);
		String path = "C:\\Users\\lee\\Desktop\\묶어놓은거\\묶어놓은거\\src\\wholecal.txt";  //위치 바뀔때마다 계속 바꿔줘야함
		ArrayList<String[]> temp = new ArrayList<>();
		try {
			FileReader outputReader = new FileReader(path);
			BufferedReader bufferedOutput1 = new BufferedReader(outputReader);
			String gotString;
			while ((gotString = bufferedOutput1.readLine()) != null) {
				temp.add(gotString.split(" "));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException err) {
			err.printStackTrace();
		}
		String[][] customTableList = new String[temp.size()][3];
		temp.toArray(customTableList);
		table.setModel(new DefaultTableModel(
				customTableList,
			new String[] {
				"운동명", "소모칼로리", "참고영상"
			}
		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {				// TODO Auto-generated method stub	
			}
			
			@Override
			public void mousePressed(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseExited(MouseEvent e) {					// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Desktop.getDesktop().browse(new URI(customTableList[table.getSelectedRow()][2]));
			    } catch (IOException | URISyntaxException e1) {
			    	// TODO Auto-generated catch block
			        e1.printStackTrace();
			    } 
			}
		});
		
		/////////////////////////////////////////////////////////////////////////////////////////////	
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("상  체", null, scrollPane1, null);
		
		table_1 = new JTable();
		table_1.setRowHeight(32);
		String path1 = "C:\\Users\\lee\\Desktop\\묶어놓은거\\묶어놓은거\\src\\upcal.txt";  //위치 바뀔때마다 계속 바꿔줘야함
		ArrayList<String[]> temp1 = new ArrayList<>();
		try {
			FileReader outputReader = new FileReader(path1);
			BufferedReader bufferedOutput1 = new BufferedReader(outputReader);
			String gotString;
			while ((gotString = bufferedOutput1.readLine()) != null) {
				temp1.add(gotString.split(" "));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException err) {
			err.printStackTrace();
		}
		String[][] customTableList1 = new String[temp1.size()][3];
		temp1.toArray(customTableList1);
		table_1.setModel(new DefaultTableModel(
				customTableList1,
			new String[] {
				"운동명", "소모칼로리", "참고영상"
			}
		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
		table_1.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {				// TODO Auto-generated method stub	
			}
			
			@Override
			public void mousePressed(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseExited(MouseEvent e) {					// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Desktop.getDesktop().browse(new URI(customTableList1[table_1.getSelectedRow()][2]));
			    } catch (IOException | URISyntaxException e1) {
			    	// TODO Auto-generated catch block
			        e1.printStackTrace();
			    } 
			}
		});
		
		/////////////////////////////////////////////////////////////////////////////////////////////	
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("복  부", null, scrollPane2, null);
		
		table_2 = new JTable();
		table_2.setRowHeight(32);
		String path2 = "C:\\Users\\lee\\Desktop\\묶어놓은거\\묶어놓은거\\src\\middlecal.txt";  //위치 바뀔때마다 계속 바꿔줘야함
		ArrayList<String[]> temp2 = new ArrayList<>();
		try {
			FileReader outputReader = new FileReader(path2);
			BufferedReader bufferedOutput2 = new BufferedReader(outputReader);
			String gotString;
			while ((gotString = bufferedOutput2.readLine()) != null) {
				temp2.add(gotString.split(" "));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException err) {
			err.printStackTrace();
		}
		String[][] customTableList2 = new String[temp2.size()][3];
		temp2.toArray(customTableList2);
		table_2.setModel(new DefaultTableModel(
				customTableList2,
			new String[] {
				"운동명", "소모칼로리", "참고영상"
			}
		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
		table_2.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {				// TODO Auto-generated method stub	
			}
			
			@Override
			public void mousePressed(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseExited(MouseEvent e) {					// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Desktop.getDesktop().browse(new URI(customTableList2[table_2.getSelectedRow()][2]));
			    } catch (IOException | URISyntaxException e1) {
			    	// TODO Auto-generated catch block
			        e1.printStackTrace();
			    } 
			}
		});
		
		/////////////////////////////////////////////////////////////////////////////////////////////	
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("하  체", null, scrollPane3, null);
		
		table_3 = new JTable();
		table_3.setRowHeight(32);
		String path3 = "C:\\Users\\lee\\Desktop\\묶어놓은거\\묶어놓은거\\src\\downcal.txt";  //위치 바뀔때마다 계속 바꿔줘야함
		ArrayList<String[]> temp3 = new ArrayList<>();
		try {
			FileReader outputReader = new FileReader(path3);
			BufferedReader bufferedOutput3 = new BufferedReader(outputReader);
			String gotString;
			while ((gotString = bufferedOutput3.readLine()) != null) {
				temp3.add(gotString.split(" "));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException err) {
			err.printStackTrace();
		}
		String[][] customTableList3 = new String[temp3.size()][3];
		temp3.toArray(customTableList3);
		table_3.setModel(new DefaultTableModel(
				customTableList3,
			new String[] {
				"운동명", "소모칼로리", "참고영상"
			}
		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
		table_3.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {				// TODO Auto-generated method stub	
			}
			
			@Override
			public void mousePressed(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseExited(MouseEvent e) {					// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Desktop.getDesktop().browse(new URI(customTableList3[table_3.getSelectedRow()][2]));
			    } catch (IOException | URISyntaxException e1) {
			    	// TODO Auto-generated catch block
			        e1.printStackTrace();
			    } 
			}
		});
		scrollPane.setViewportView(table);
		scrollPane1.setViewportView(table_1);
		scrollPane2.setViewportView(table_2);
		scrollPane3.setViewportView(table_3);
		
//		/////////////////////////////////////////////////////////////////////////////////////////////	
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setResizable(false);
	}
}
