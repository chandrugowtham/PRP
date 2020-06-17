package Inheritance;

public class Employee2 extends Person2 {
 private double salary;
 private int year;
 private String InsuranceNumber;
public Employee2(String name, double salary, int year, String insuranceNumber) {
	super(name);
	this.salary = salary;
	this.year = year;
	InsuranceNumber = insuranceNumber;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getInsuranceNumber() {
	return InsuranceNumber;
}
public void setInsuranceNumber(String insuranceNumber) {
	InsuranceNumber = insuranceNumber;
}
@Override
public String toString() {
	return "Employee2 [salary=" + salary + ", year=" + year + ", InsuranceNumber=" + InsuranceNumber+",Name=" +Name+ "]";
}

 
	
}
