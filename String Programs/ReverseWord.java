package programming_string;

import java.util.Scanner;

//public class ReverseWord {
//
//	public static void main(String[] args) {
//	System.out.println("Let's begin new chapter from here ");
//	String sen="Java";
//	for (int i =sen.length()-1; i >=0 ; i--) {
//		System.out.print(sen.charAt(i));
//	}
//	}
//
//}


public class ReverseWord {

	public static void main(String[] args) {
	System.out.println("Dynamic input using scanner class");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word");
	String sen=sc.next();
	for (int i =sen.length()-1; i >=0 ; i--) {
		System.out.print(sen.charAt(i));
	}
	}

}
