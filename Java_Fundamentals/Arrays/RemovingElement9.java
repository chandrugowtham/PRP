package Array;

import java.util.Scanner;

import jdk.nashorn.internal.ir.WithNode;

public class RemovingElement9 {
	  
	public static  String withoutTen(int[] nums) {
		int arr[]=new int[nums.length];
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=10) {
				arr[count]=nums[i];
				count++;
				
			}System.out.println(arr[i]);
		}
		return "";
	}
	

	public static void main(String[] args) {
	int len=args.length;
	int c=0;
	int[] arr=new int[len];
	for(int i=0;i<len;i++) {
		arr[i]=Integer.parseInt(args[c]);
		c++;
		
	}System.out.println(withoutTen(arr));
	}
}


