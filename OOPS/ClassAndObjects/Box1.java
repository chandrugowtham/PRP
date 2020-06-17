package ClassAndObjects;

public class Box1 {
double height;
double breadth;
double width;

public Box1(double height,double breadth,double width) {
	this.breadth=breadth;
	this.height=height;
	this.width=width;
}
double Volume() {
	double Vol=0;
	Vol=breadth*height*width;
	return Vol;
	
}
public static void main(String args[]) {
	Box1 b=new Box1(12.0, 12.0, 12.0);
	System.out.println(b.Volume());
}
}
