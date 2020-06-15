package FlowControlStatements;

public class Prime13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int count=0;
		for(int i=num1;i<=num2;i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}
	}
	private static boolean prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2)
			return true;
		else
		return false;
		
	}

}
