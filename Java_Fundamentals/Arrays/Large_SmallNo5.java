package Array;

public class Large_SmallNo5 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}for(int i=0;i<args.length;i++) {
			for(int j=i+1;j<args.length -1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
			System.out.println("2 Smallest Numbers="+arr[0]+" "+arr[1]);
			System.out.println("2 largest Numbers="+arr[num-2]+" "+arr[num-1]);
		
	}

}
