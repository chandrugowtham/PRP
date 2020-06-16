package Array;

public class ArraySumandAvg1 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int arr[]=new int[num];
		int sum=0;
		float Average=0;
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
		}System.out.println(sum);
		Average=sum/num;
		System.out.println(Average);
		
	
	}

}
