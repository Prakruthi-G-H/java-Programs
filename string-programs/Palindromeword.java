package programming_string;

import java.util.Scanner;

public class Palindromeword {

	public static void main(String[] args) {
//		String s="Java";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
	rev=rev+s.charAt(i);
		}
		
		if (s.equals(rev)) {
			System.out.println("The given string is a palindrome.");
		} else {
   System.out.println("The given string is not a palindrome.");
		}	
		sc.close();
	}

}



