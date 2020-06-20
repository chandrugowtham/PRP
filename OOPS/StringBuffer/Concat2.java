package StringBuffer;

import java.util.Scanner;

public class Concat2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String str=string.toLowerCase();
		String spil[]=str.split(",");
		
		char str1=spil[0].charAt(spil[0].length()-1);
		char str2=spil[1].charAt(0);
		if(str1==str2) {
			System.out.println(spil[0]+""+spil[1].substring(1));
		}else {
			System.out.println(spil[0]+spil[1]);
		}
	}

}
