import java.util.Scanner;

public class ReadFile{
 public static void main(String[] args) throws Exception{
	
	java.io.File file = new java.io.File("scores.txt");
	
	Scanner input = new Scanner(file);

	while(input.hasNext()){
	 String Name = input.next();
	 int studentID = input.nextInt();
	 int courseNumber = input.nextInt();
	 System.out.println(courseNumber+" "+Name+" "+studentID);
	 }
	
	input.close();
	}
}