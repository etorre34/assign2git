package src.com.csc205.activities.activity3;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	public static void main(String[] args) {
	/*	Shape s1 = new Square(3);
		Shape c1 = new Circle(3);
		Shape r1 = new Rectangle(2,5);
		Shape t1 = new Triangle(4.0, 7,0);*/
		
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Square(3));
		shapes.add(new Circle(3));
		shapes.add(new Rectangle(2,5));
		shapes.add(new Triangle(4.0, 7.0));
		
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
		
		Shape shape = new Shape() { //this is call an anonymous UI class, type of inner class

			@Override
			public double calculateArea() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double calculatePerimeter() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
        /*System.out.println(s1);
        System.out.println(c1);
        System.out.println(r1);
        System.out.println(f1);*/
	}

}
