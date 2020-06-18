package PolyMorphismOverriding;

public class square extends shape{

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	@Override
	public void erase() {
		System.out.println("Erasing square");
	}
}
