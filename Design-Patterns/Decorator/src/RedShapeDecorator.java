
public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		this.component.draw();
		this.addRedDecoration();
		
	}

	private void addRedDecoration() {
		System.out.println("Adding red color to the shape");
	}

}
