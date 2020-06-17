package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author au=new Author("Deepak", "Deepak@gmail.com", 'M');
		Book bo=new Book("Data Analytics", 1000.50,27 );
		System.out.println("The details Of Author and Book is");
		System.out.println(au);
		System.out.println(bo);
	}

}
