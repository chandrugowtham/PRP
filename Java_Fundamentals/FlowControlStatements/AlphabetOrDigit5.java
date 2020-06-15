package FlowControlStatements;
public class AlphabetOrDigit5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		if(s.matches("[0-9]+")) {
			System.out.println("Digit");
		}else if(s.matches("[a-z]+") ||s.matches("[A-Z]+")) {
			System.out.println("Alphabhet");
		}else {
			System.out.println("Special Character");
		}
	}

}
