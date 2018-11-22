import java.util.Scanner;

public class UsePalindromeClass {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a sentence: ");
      String sentence = sc.next();
      
      Palindrome palindrome = new Palindrome();
      System.out.println(palindrome.isPalindrome(sentence));
   }
}