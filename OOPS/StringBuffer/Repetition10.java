package StringBuffer;

import java.util.Scanner;

public class Repetition10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String spil[]=str.split(",");
		int num=Integer.parseInt(spil[1]);
		for(int i=0;i<num;i++) {
		System.out.print(spil[0].substring(num-1));
	}
	}

}
