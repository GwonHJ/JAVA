import java.util.Scanner;

public class test {
   public static void main(String[] args) {
      int sum = 0;

      Scanner sc = new Scanner(System.in);
      System.out.print("Today (year) : ");
      int year = sc.nextInt();

      System.out.print("Today (month) : ");
      int month = sc.nextInt();
   
      System.out.print("Today (day) : ");
      int day = sc.nextInt();

      System.out.print("You and your friend have been meeting for (days) : ");
      int num = sc.nextInt();

      while(num >= day) {
         num -= day;
         sum += day;
         if(month == 1) {
            year -= 1;
            month = 12;
         }
         else
            month -= 1;

         switch(month) {
         case 1: case 3: case 5: case 7:
         case 8: case 10: case12:
            day = 31;
            break;

         case 4: case 6: case 9: case 11:
            day = 30;
            break;

         case 2:
            if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
               day = 29;
               break;
            } else {
               day = 28;
               break;
            }
         }
      }
      day -= num;


      System.out.println("The first day we met : " + year + "." + month +"." + day);
   }
}