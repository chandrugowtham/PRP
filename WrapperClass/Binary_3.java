import java.util.Scanner;

public class Binary_3 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String str=String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
	System.out.println(str);
	sc.close();
}
}
