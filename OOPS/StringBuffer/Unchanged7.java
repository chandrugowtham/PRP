package StringBuffer;

import java.util.Scanner;

public class Unchanged7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		if(ch[0]==ch[str.length()-1]) {
			for(int i=1;i<str.length()-1;i++) {
				System.out.print(ch[i]);
			}
		}else {
			System.out.println(str);
		}

	}

}
