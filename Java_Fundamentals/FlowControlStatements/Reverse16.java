package FlowControlStatements;

public class Reverse16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=0) {
		int num=Integer.parseInt(args[0]);
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
		}else {
			System.out.println("Please Enter The Number");
		}
	}

}
