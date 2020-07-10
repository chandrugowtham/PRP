package ExceptionHandling;
import java.util.*;

public class ArrayIndexException1 {
public static void main(String args[]) {
	System.out.println("Enter the Number Of Elements");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int index=0;
	int arr[]=new int[n];
	System.out.println("Enter the Elements");
	try {

		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		System.out.println("Enter the Index of Array");
		index=sc.nextInt();
		System.out.println(arr[index]);
		System.out.println("The array elements Accessed");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}catch(InputMismatchException e) {
		System.out.println(e);
	}
}
}
