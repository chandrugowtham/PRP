package PolyMorphismOverriding;

import java.util.Scanner;

public class Fruit {
	protected String Name;
	protected int Size;
	protected String Taste;
	

 public void eat() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name of Fruit");
	Name=sc.next();
	System.out.println("Enter the Taste Of Fruit");
	Taste=sc.next();
	System.out.println("Name of Fruit="+Name);
	System.out.println("Taste Of Fruit="+Taste);
 }
}