package PatternEgs;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your shape type:");
		String shape=sc.nextLine();
		
		ShapeFactory sf=new ShapeFactory();
		Shape s=sf.getShape(shape.toUpperCase());
		s.draw();
		System.out.println("Area of circle:"+s.getArea());
		System.out.println("Perimeter of circle:"+s.getPerimeter());
		
//		Shape s1=sf.getShape("CIRCLE");
//		s1.draw();
//		System.out.println("Area of circle:"+s1.getArea());
//		System.out.println("Perimeter of circle:"+s1.getPerimeter());
//		
//		Shape s2=sf.getShape("RECTANGLE");
//		s2.draw();
//		System.out.println("Area of rectangle:"+s2.getArea());
//		System.out.println("Perimeter of rectangle:"+s2.getPerimeter());
//		
//		Shape s3=sf.getShape("SQUARE");
//		s3.draw();
//		System.out.println("Area of square:"+s3.getArea());
//		System.out.println("Perimeter of square:"+s3.getPerimeter());
	}

}
