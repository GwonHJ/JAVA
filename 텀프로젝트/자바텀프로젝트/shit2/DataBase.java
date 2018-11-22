package shit2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class DataBase {
	private ArrayList<String> s1 = new ArrayList<>();
	public DataBase(){}
	public void settext(String s) throws IOException{ 
		s1.add(s);
		FileWriter fw = new FileWriter("data.txt",true);
		fw.append(s);
		fw.close();
	}
	
	public String gettext() {
		String result = new String();
		for (String elm : s1) {
			result = result.concat(elm);
		}
		return result;
	} 

	@Deprecated
	public void clearText() {
		//s1 = "";
	}
}
