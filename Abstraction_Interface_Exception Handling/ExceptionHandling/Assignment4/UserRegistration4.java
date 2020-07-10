package ExceptionHandling;

import org.omg.CORBA.UserException;

public class UserRegistration4 {
public void user(String username,String userCountry) throws InvalidcountryException4{
  if(!userCountry.equals("India"))
	  throw new InvalidcountryException4();
  else
	  System.out.println("User Registration done Successfully");
}
 public static void main(String args[]) {
	 UserRegistration4 userRegister=new UserRegistration4();
	 try {
		 userRegister.user("chan", "India");
	 }catch(InvalidcountryException4 e) {
		 
	 }
 }
}
