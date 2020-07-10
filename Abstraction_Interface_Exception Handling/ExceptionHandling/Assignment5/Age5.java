package ExceptionHandling;

public class Age5 {
public static void main(String args[]) throws AgeException5 {
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	if(age<18 || age>=60)
		throw new AgeException5();
	System.out.println(name+" "+age);
}
}
