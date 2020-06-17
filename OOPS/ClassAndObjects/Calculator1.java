package ClassAndObjects;

public class Calculator1 {

	static double PowerInt(int num1,int num2) {
		return Math.pow(num1,num2);
	}
	static double PowerDouble(int num1,int num2) {
		return Math.pow(num1,num2);
	}
	
	public static void main(String args[]) {
		System.out.println(Calculator1.PowerInt(20, 4));
		System.out.println(Calculator1.PowerDouble(16, 4));
	}

}
