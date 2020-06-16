package Array;

public class Print_True11 {
	private static boolean check(int arr[]) {
		for(int ele:arr) {
			if(ele!=1 && ele!=4) 
				return false;
		}return true;
	}
	
public static void main(String args[]) {
	int i=args.length;
	int arr[]=new int[i];
	int c=0;
	for(int i1=0;i1<args.length;i1++) {
		arr[i1]=Integer.parseInt(args[c]);
		c++;
	}System.out.println(check(arr));
}
}
