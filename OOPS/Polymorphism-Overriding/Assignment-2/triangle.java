package PolyMorphismOverriding;

public class triangle extends shape{
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	@Override
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
