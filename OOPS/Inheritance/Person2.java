package Inheritance;

public class Person2 {
 protected String Name;

public Person2(String name) {
	super();
	Name = name;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

@Override
public String toString() {
	return "Person2 [Name=" + Name + "]";
}
 
}
