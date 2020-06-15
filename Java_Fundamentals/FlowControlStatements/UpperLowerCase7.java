package FlowControlStatements;

public class UpperLowerCase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		if(args[0].matches("[a-z]+")) {
			System.out.println(args[0].toUpperCase());
		}else if(args[0].matches("[A-Z]+")) {
			System.out.println(args[0].toLowerCase());
		}
	}

}
