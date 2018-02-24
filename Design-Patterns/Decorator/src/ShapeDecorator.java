
public abstract class ShapeDecorator implements Shape {
	protected Shape component;
	
	public ShapeDecorator(Shape shape) { 
		this.component = shape;
	}
}

