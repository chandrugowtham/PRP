package StringBuffer;

import java.util.Scanner;

public class Without1_2Char5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=1;i<str.length()-1;i++) {
			System.out.print(ch[i]);
		}

	}

}
