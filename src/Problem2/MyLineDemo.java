package Problem2;

public class MyLineDemo {
	public static void main(String[] args) {
		MyLine line1 = new MyLine(1, 2, 3, 4);
		System.out.println("Line 1: " + line1);

		MyPoint begin = new MyPoint(0, 0);
		MyPoint end = new MyPoint(3, 4);
		MyLine line2 = new MyLine(begin, end);
		System.out.println("Line 2: " + line2);

		// Test getters and setters
		line2.setBeginXY(2, 3);
		line2.setEndXY(5, 7);
		System.out.println("Updated line 2: " + line2);

		System.out.println("Begin X: " + line2.getBeginX());
		System.out.println("End Y: " + line2.getEndY());

		// Test length and gradient
		System.out.printf("Length: %.2f%n", line2.getLength());
		System.out.printf("Gradient: %.2f%n", line2.getGradient());
	}
}

