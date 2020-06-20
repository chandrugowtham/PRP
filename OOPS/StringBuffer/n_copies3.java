package StringBuffer;

import java.util.Scanner;

public class n_copies3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[0]+""+ch[1]);
		}
	}

}
