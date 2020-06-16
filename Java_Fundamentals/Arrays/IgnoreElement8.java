package Array;
public class IgnoreElement8 {
	private static String ignore(int[] arr,int a,int b) {
		int nums[]=new int[arr.length];
		int index1=0,index2=0;
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum1+=arr[i];
			if(arr[i]==a) {
				index1=i;
				//System.out.println("Index of a="+index1);
			}else if(arr[i]==b) {
				index2=i;
				//System.out.println("Index of b="+index2);
			}
		}
		//System.out.println(sum1);
		for(int j=index1;j<=index2;j++) {
			sum2+=arr[j];
		}System.out.println(sum1-sum2);
		return "";
	}
public static void main(String[] args) {
	
		int a=6;
		int b=7,c=0;
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++ ) {
			arr[i]=Integer.parseInt(args[c]);
			c++;
		}System.out.println(ignore(arr,a,b));
	}
}
