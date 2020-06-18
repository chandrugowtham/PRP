package PolyMorphismOverriding;

public class circle extends shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
