package ExceptionHandling;

import java.util.Scanner;

public class Marks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			String name="";
			int subA = 0,subB = 0,subC = 0;
			try {
				name=sc.nextLine();
				if(sc.hasNext())
					subA=sc.nextInt();
					else
					throw new NumberFormatException();
					if(sc.hasNext())
					subB=sc.nextInt();
					else
					throw new NumberFormatException();
					if(sc.hasNext())
					subC=sc.nextInt();
					else
					throw new NumberFormatException();
					
					if(subA<0) throw new NegativeValue3();
					if(subA>100) throw new ValueOutOfRange3();
					if(subB<0) throw new NegativeValue3();
					if(subB>100) throw new ValueOutOfRange3();
					if(subC<0) throw new NegativeValue3();
					if(subC>100) throw new ValueOutOfRange3();
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch(ValueOutOfRange3 e) {
		System.out.println(e.getMessage());
	}catch(NegativeValue3 e) {
		System.out.println(e.getMessage());
	}
System.out.println(name+" "+subA+" "+subB+" "+subC);
}sc.close();
}
}