package FlowControlStatements;

public class No_PosOrNeg1A {
public static void main(String args[]) {
	int i1=Integer.parseInt(args[0]);
	if(i1==0) {
		System.out.println("Zero");
	}else if(i1>0) {
		System.out.println("Positive");
	}else {
		System.out.println("Negative");
	}
}
}
