package shit2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{
	DataBase db = null;
	
	public MyListener (DataBase db){
		this.db = db;
	}
	
	public void actionPerformed(ActionEvent e) {
	Test t = Test.getInstance();
	Main1 m = Main1.getInstance();
		if (e.getActionCommand().equals("�Է�")) { 
		    try {
		    	BodyInfo temp = new BodyInfo(t.tf2.getText().toString(),
		    			t.tf1.getText().toString());
				db.settext(temp.getIndex() + "�� : ������ : " + temp.getWeight() + "kg  "
							+ "Ű : "+ temp.getHeight() + "cm \r\n");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    m.testArea.setText(db.gettext());
		    //db.clearText();
		} 	   

	}
}
