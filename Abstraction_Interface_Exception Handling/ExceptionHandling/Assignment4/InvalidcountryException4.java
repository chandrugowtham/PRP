package ExceptionHandling;

public class InvalidcountryException4 extends Exception{
public InvalidcountryException4() {
	super();
	System.out.println("InvalidCountryException Occured");
	System.out.println("User Outside India cannot be Registered");
}

}
