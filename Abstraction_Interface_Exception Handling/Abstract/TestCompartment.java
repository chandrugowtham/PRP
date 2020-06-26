package Abstract;
import java.util.Scanner;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment c[]=new Compartment[10];
		double ran=Math.random()*5;
		int i=(int)ran;
		System.out.println(i);
		switch(i) {
		case 1:c[1]=new FirstClass();
				c[1].notice();
				break;
		case 2:c[2]=new Ladies();
				c[2].notice();
				break;
		case 3:c[3]=new General();
				c[3].notice();
				break;
		case 4:c[4]=new Luggage();
				c[4].notice();
				break;
		default:System.out.println("Invalid Choice");
		}
	}

}
