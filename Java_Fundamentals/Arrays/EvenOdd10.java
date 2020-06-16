package Array;

public class EvenOdd10 {
private static  String evenodd(int[] arr) {
	int nums[]=new int[arr.length];
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if((arr[i] % 2)==0) {
			System.out.print(arr[i]+" ");
			count++;
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.print(arr[i]+" ");
		}
	}
	return "";

}
	public static void main(String[] args) {
		int arr[]=new int[args.length];
		int c=0;
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[c]);
			c++;
		}//System.out.println(evenodd(arr));
		for(int i=0;i<args.length;i++) {
			for(int j=i+1;j<args.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}System.out.print(evenodd(arr));
	}

}
