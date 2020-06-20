package StringBuffer;

import java.util.Scanner;

public class MixingChar9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String spil[]=str.split(",");
		/*for(int i=0;i<spil.length;i++) {
			System.out.println(spil[i]);
		}*/
		char ch1[]=spil[0].toCharArray();
		char ch2[]=spil[1].toCharArray();
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]+""+ch2[i]);
		}

	}

}
