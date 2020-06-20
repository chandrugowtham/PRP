package StringBuffer;

import java.util.Scanner;
public class Removing8 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int index=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='*') {
				index=i;
			}
		}int k=0;
		char ch1=ch[index+1];
		char ch2=ch[index-1];
		//System.out.println(ch1+""+ch2);
		for(int i=0;i<str.length();i++) {
			if(ch[i]!=ch1 && ch[i]!=ch2 && ch[i]!='*') {
						System.out.print(ch[i]);
					}
				}
		}
		
		}
	
