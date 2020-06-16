package Array;

public class ascii4 {

	public static void main(String[] args) {

	String str=null;
	int arr[]=new int[5];
		for(int i=0;i<5;i++) {
		arr[i]=Integer.parseInt(args[i]);
		//str=Character.toString((char)num);
	}for(int i:arr) {
		str=Character.toString((char)i);
		System.out.println(str);
	}
	}
}
