package Array;

import java.util.Arrays;

public class Sorting6 {

	public static void main(String[] args) {
		
		int num=5;
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=Integer.parseInt(args[i]);

	}
		for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {		//Descending if(arr[i]<arr[j]) {	
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				//System.out.println(arr[i]);
			}
		}
	}for(int i:arr) {
		System.out.println(i);
	}
	}
	}



