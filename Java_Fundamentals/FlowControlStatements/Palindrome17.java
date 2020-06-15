package FlowControlStatements;

public class Palindrome17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=0) {
			int num=Integer.parseInt(args[0]);
			int rem=0,sum=0;
			int temp=num;
			while(num>0) {
				rem=num%10;
				sum=sum*10 +rem;
				num=num/10;
			}
				//System.out.print(rem);
			if(temp==sum) {
				System.out.println(temp+" ia a palindrome");
			}else {
				System.out.println(temp+" ia a not a palindrome");
			}
		}else {
			System.out.println("Please enter the Given Number");
		}
	}

}
