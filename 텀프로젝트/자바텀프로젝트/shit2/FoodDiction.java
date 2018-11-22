package shit2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;

	public class FoodDiction extends JFrame{
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTable table;
		private JTable table_1;
		
		MyFrame frame1 = new MyFrame();
				
	public FoodDiction() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 69, 958, 684);
		panel_1.setLayout(null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�� �� Į �� �� �� ��");
		JLabel lblNewLabel2 = new JLabel("�� �� �� �� �� �� �� �� �� ��");
		lblNewLabel.setBounds(390, 10, 215, 20);
		lblNewLabel2.setBounds(425, 30, 450, 20);
		lblNewLabel.setFont(new Font("��ü�� ���� ����ü", Font.BOLD, 20));
		panel.add(lblNewLabel);
		panel.add(lblNewLabel2);
		
		contentPane.setLayout(null);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 560, 567);
		panel_1.add(scrollPane);
		
		table = new JTable();					//�̹� ����ó���� ���� JTABLE
		table.setRowHeight(32);
		String path0 = "C:\\Users\\lee\\Desktop\\���������\\���������\\src\\foodcal.txt";
		scrollPane.setViewportView(table);
		ArrayList<String[]> temp0 = new ArrayList<>();
		try {
			FileReader outputReader = new FileReader(path0);
			BufferedReader bufferedOutput0 = new BufferedReader(outputReader);
			String gotString;
			while ((gotString = bufferedOutput0.readLine()) != null) {
				temp0.add(gotString.split(" "));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException err) {
			err.printStackTrace();
		}
		String[][] customTableList0 = new String[temp0.size()][3];
		temp0.toArray(customTableList0);
		
		table.setModel(new DefaultTableModel(
				customTableList0,
			new String[] {
				"��ȣ", "���ĸ�", "Į�θ�"
			}		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		
		
		JButton btnNewButton = new JButton("��  ��");	
		btnNewButton.addActionListener(new ActionListener() {				//�߰���ư �������� üũ�ڽ� �Ȱ͸� table_1�� ������
			public void actionPerformed(ActionEvent e) {
			DefaultTableModel m= (DefaultTableModel)table_1.getModel();
			table.addMouseListener(null);
			for(int i=0; i<table.getSelectedRows().length; i++) {
				m.insertRow(0, new Object[]{customTableList0[table.getSelectedRows()[i]][1],customTableList0[table.getSelectedRows()[i]][2]});
			}
		}
	});
		btnNewButton.setBounds(574, 0, 185, 55);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(572, 67, 386, 500);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(157, 442, 212, 34);
		panel_2.add(textPane);
		textPane.setEditable(false);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {					//���¹�ư �������� �ϴ� ���� üũ�ڽ�,table_1,��갪����
					public void actionPerformed(ActionEvent e) {
					DefaultTableModel m= (DefaultTableModel)table_1.getModel();
					int rowCount = m.getRowCount();
					for (int i = rowCount - 1; i >= 0; i--) {
						m.removeRow(i);}
					textPane.setText("");}
			});
		btnReset.setBounds(773, 0, 185, 55);
		panel_1.add(btnReset);
		
		JLabel label = new JLabel("�� ��������Į�θ�");
		label.setFont(new Font("����", Font.PLAIN, 17));
		label.setBounds(14, 452, 141, 18);
		panel_2.add(label);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 12, 355, 370);
		panel_2.add(scrollPane_1);
		
		table_1= new JTable();
		table_1.setRowHeight(25);
		scrollPane_1.setViewportView(table_1);
		String[][] customTableList1 = new String[temp0.size()][2];
		temp0.toArray(customTableList1);
		
		table_1.setModel(new DefaultTableModel(
				new Object[][] {},
			new String[] {
				"��������", "����Į�θ�"
			}		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
		JButton button = new JButton("��  ��");
		button.addActionListener(new ActionListener() {						//������ư �������� ������ �ٸ� �����ǰ�
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m =(DefaultTableModel) table_1.getModel();
				int[] a = table_1.getSelectedRows();
				Arrays.sort(a);
				for(int i=a.length-1; i>=0; i--) {
					m.removeRow(a[i]);
				}	
			}
		});
		button.setBounds(14, 394, 169, 36);
		panel_2.add(button);
		
		JButton button_1 = new JButton("��  ��");
		button_1.addActionListener(new ActionListener() {					//��� ��ư �������� ������ ���� Į�θ� �� �����ֱ�
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m= (DefaultTableModel)table_1.getModel();
				int rowCount = m.getRowCount();
				int sum=0;
				for(int i = rowCount - 1; i >= 0; i--) {
					sum+=Integer.parseInt(table_1.getModel().getValueAt(i, 1).toString());
				}
				textPane.setText(sum+"");
			}
		});
		button_1.setBounds(197, 394, 169, 36);
		panel_2.add(button_1);
		contentPane.add(panel);
		
		String[] addlist = new String[2];
				
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
					
					addlist[0] = customTableList0[table.getSelectedRow()][1];
					addlist[1] = customTableList0[table.getSelectedRow()][2];
					
					
			    } catch (Exception exception) {
			    	// TODO Auto-generated catch block
			        exception.getMessage();
			    } 
			}
		});
}
	}