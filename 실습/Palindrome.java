import java.util.*;

public class Palindrome{
public static void main(String args[]){

	
	Scanner sc = new Scanner(System.in);
	System.out.println("문장을 입력하시오.");
	String s = sc.nextLine();
	s=s.toLowerCase();

	String newS = "";
 
	for(int i=0;i<s.length();i++){
		if((48<=s.charAt(i)&&s.charAt(i)<=57)||(97<=s.charAt(i)&&s.charAt(i)<=122))
			newS += s.charAt(i);
		else
			continue;
	}

	String reverse = "";

	for(int i=0; i< newS.length();i++){
		reverse += newS.charAt(newS.length()-i-1);
	}
		
	System.out.println(newS);
	
	System.out.println(reverse);
	
		
	if(reverse==newS)
		System.out.println("palindrome");
	else
		System.out.println("non palindrome");
	
}
}