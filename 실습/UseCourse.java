class Course{
   private String courseName;
   private int numberOfStudents=0;
   private String[] students=new String[numberOfStudents];
   
   public Course(String courseName){
      this.courseName=courseName;
   }
   
   public String getCourseName(){   return courseName;   }
   
   public void addStudent(String student){
      String[] copy=new String[numberOfStudents];
      for(int i=0;i<students.length;i++){
         copy[i]=students[i];
      }
      
      numberOfStudents++;
      
      students=new String[numberOfStudents];
      
      for(int i=0;i<numberOfStudents-1;i++){
         students[i]=copy[i];
      }
      students[numberOfStudents-1]=student;
   }
   
   public void dropStudent(String student){
      for(int i=0;i<numberOfStudents;i++){
         if(students[i].equals(student)){
            students[i]="";
         }
      }
   }
   
   public String[] getStudents(){
      return students;
   }
   
   public int getNumberOfStudents(){   return numberOfStudents;   }
}


public class UseCourse{
   public static void main(String[] args){
      
      Course course=new Course("JAVA");
   
      course.addStudent("a");
      course.addStudent("b");
            
      String[] str=course.getStudents();
      
      for(int i=0;i<str.length;i++){
         System.out.print(str[i]+" ");
      }
      
      System.out.println();
      
      course.dropStudent("a");
      
      for(int i=0;i<str.length;i++){
         System.out.print(str[i]+" ");
      }

   }
}