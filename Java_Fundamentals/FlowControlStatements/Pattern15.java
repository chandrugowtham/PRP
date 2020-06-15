package FlowControlStatements;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=0) {
			int num=Integer.parseInt(args[0]);
			for(int i=0;i<num;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}System.out.println();
			}
		}else {
			System.out.println("Please enter an integer number");
		}
	}

}
