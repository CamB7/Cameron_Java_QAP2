package Problem3;
import Problem2.MyPoint;

public class MyRectangleDemo {
	public static void main(String[] args) {

		// Create two points
		MyPoint p1 = new MyPoint(1, 5);
		MyPoint p2 = new MyPoint(6, 1);

		// Create rectangle using MyPoint objects
		MyRectangle rect1 = new MyRectangle(p1, p2);
		System.out.println("Rectangle 1: " + rect1);
		System.out.println("Width: " + rect1.getWidth());
		System.out.println("Height: " + rect1.getHeight());
		System.out.println("Area: " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());

		// Create rectangle using coordinates
		MyRectangle rect2 = new MyRectangle(0, 10, 10, 0);
		System.out.println("\nRectangle 2: " + rect2);
		System.out.println("Width: " + rect2.getWidth());
		System.out.println("Height: " + rect2.getHeight());
		System.out.println("Area: " + rect2.getArea());
		System.out.println("Perimeter: " + rect2.getPerimeter());

		// Modify corners
		rect2.setTopLeft(new MyPoint(2, 8));
		rect2.setBottomRight(new MyPoint(8, 2));
		System.out.println("\nAfter modifying Rectangle 2:");
		System.out.println(rect2);
	}
}

