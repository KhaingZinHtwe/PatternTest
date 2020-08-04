package PatternEgs;

public class Circle implements Shape {
	public double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Inside Circle::draw() method.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
}
