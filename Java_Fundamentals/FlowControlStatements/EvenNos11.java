package FlowControlStatements;

public class EvenNos11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=Integer.parseInt(args[0]);
		int i2=Integer.parseInt(args[1]);
		for(int i=i1;i<=i2;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
