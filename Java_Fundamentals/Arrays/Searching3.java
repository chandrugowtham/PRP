package Array;

public class Searching3 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int count=0;
		for(int i=0;i<5;i++) {
		     arr[i]=Integer.parseInt(args[i]);
		}
		int search=Integer.parseInt(args[5]);
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==search) {
				System.out.println(j);
			}else if(arr[j]!=search) {
				count++;
			}
			
		}if(count>4) {
			System.out.println("-1");
		}
		}
	
	}
