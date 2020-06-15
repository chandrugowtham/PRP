package FlowControlStatements;

public class LastDigit1B {
public static boolean lastDigit(int i1,int i2) {
	int d1=i1%10;
	int d2=i2%10;
	if(d1==d2)
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		int i1=Integer.parseInt(args[0]);
		int i2=Integer.parseInt(args[1]);
		System.out.println(lastDigit(i1,i2));
		
		

	}

}
