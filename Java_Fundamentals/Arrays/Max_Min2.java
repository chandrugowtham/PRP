package Array;

public class Max_Min2 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(args[i]);
			
		}int min=arr[0];
		int max=arr[0];
		for(int j=0;j<num-1;j++) {
			
			if(arr[j]>max) {
				max=arr[j];
			}else if(arr[j]<min) {
				min=arr[j];
				
			}
		}System.out.println(max+" is maximum Value\n"+min+" is Minimum Value");
	}

}
