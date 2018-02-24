
public class Client {
	
	public static void main(String[] args) {
		// Create a shape
		Shape circle = new Circle();
			
		// Create Decorator
		ShapeDecorator blueDecorator = new BlueShapeDecorator(circle);
		
		System.out.println("------------Decorating it with blue");
		// Display the added behavior
		blueDecorator.draw();
		
		System.out.println("------------Now adding red on top of the blue");
		// Decorate it again
		ShapeDecorator redDecorator = new RedShapeDecorator(blueDecorator);
		
		// Display this added behavior
		redDecorator.draw();
		
	}
	
}
