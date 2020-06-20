package StringBuffer;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str=str1.toLowerCase();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb.reverse();
		String rev=sb.toString();	
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
