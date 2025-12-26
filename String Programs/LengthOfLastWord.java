package programming_string;

import java.util.Scanner;

public class LengthOfLastWord {

	private int lengthoflastword(String s) {
		s=s.trim();
		String[] st=s.split("\\s+");
		String lastword=st[st.length-1];
		int num=lastword.length();	
		return num;	
	}
	
	
	public static void main(String[] args) {
		LengthOfLastWord l=new LengthOfLastWord();
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int len=l.lengthoflastword(s);
		System.out.println(len);
		
	}
	
}
