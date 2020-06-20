package StringBuffer;

import java.util.Scanner;

public class FirstHalfLength4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		System.out.println(s.length());
		if(s.length()%2==0) {
			int len=s.length()/2;
			for(int i=0;i<len;i++) {
				System.out.print(ch[i]);
			}
		}else {
			System.out.println("null");
		}

	}


}