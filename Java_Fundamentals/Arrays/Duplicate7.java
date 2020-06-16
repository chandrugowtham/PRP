package Array;

public class Duplicate7 {

	public static void main(String[] args) {
		
		int arr[]=new int[6];
		int temp=0;
		for(int i=0;i<6;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}//for(int i=0;i<args.length;i++) 
			for(int j=0;j<args.length -1;j++) {
				if(arr[j]!=arr[j+1]) {
					System.out.print(arr[j]);
				
			}
		}
	}

}
