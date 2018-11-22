public class WriteDataWithAutoClose{
 public static void main(String[] args) throws Exception{
  java.io.File file = new java.io.File("scores.txt");
   if(file.exists()){
	 System.out.println("File already exists");
	 System.exit(0);
	 }
   try( java.io.PrintWriter output = new java.io.PrintWriter(file);){
	 
	 output.print("±ÇÇöÁö ");
	 output.println(2016113016);
	 output.println(2018);
  }
 }
}