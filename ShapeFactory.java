package PatternEgs;

import java.util.Scanner;

public class ShapeFactory {

	Scanner sc=new Scanner(System.in);
	
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			System.out.println("\nEnter radius for circle:");
			double radius=sc.nextDouble();
			return new Circle(radius);
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			System.out.println("\nEnter width for rectangle:");
			double w=sc.nextDouble();
			System.out.println("Enter length for rectangle:");
			double l=sc.nextDouble();
			return new Rectangle(w,l);
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			System.out.println("\nEnter size for square:");
			double s=sc.nextDouble();
			return new Square(s);
		}
		
		return null;
	}
}
