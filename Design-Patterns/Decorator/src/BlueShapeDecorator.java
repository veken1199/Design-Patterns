
public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		this.component.draw();
		this.addBlueDecoration();
		
	}

	private void addBlueDecoration() {
		System.out.println("Adding blue color to the shape");
	}
}
