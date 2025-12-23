package programming_string;

import java.util.Scanner;

public class PalindromeWithoutCharAt{

	public static void main(String[] args) {
//      String s="java";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
      char[] arr=s.toCharArray();
      String rev="";
      for (int i = arr.length-1; i >=0 ; i--) {
		rev=rev+arr[i];
	}
      if (rev.equals(s)) {
		System.out.println("Palindrome");
	} else {
  System.out.println("Not a Palindrome");
	}
	}

}

