package FlowControlStatements;

public class SumOfDigits14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(args[0]);
		int rem=0,sum=0;
		while(i>0) {
			rem=i%10;
			sum+=rem;
			i=i/10;
		}System.out.println(sum);
	}

}
