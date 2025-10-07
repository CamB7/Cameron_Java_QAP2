package Problem3;
import Problem2.MyPoint;

public class MyRectangle {

	// Instance variables
	private MyPoint topLeft;
	private MyPoint bottomRight;


	// Constructors
	public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public MyRectangle(int x1, int y1, int x2, int y2) {
		this.topLeft = new MyPoint(x1, y1);
		this.bottomRight = new MyPoint(x2, y2);
	}


	// Getters and setters
	public MyPoint getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(MyPoint topLeft) {
		this.topLeft = topLeft;
	}

	public MyPoint getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(MyPoint bottomRight) {
		this.bottomRight = bottomRight;
	}

	// Added for CampusMap
	public MyPoint getCenter() {
		int centerX = (topLeft.getX() + bottomRight.getX()) / 2;
		int centerY = (topLeft.getY() + bottomRight.getY()) / 2;
		return new MyPoint(centerX, centerY);
	}


	// Properties
	public int getWidth() {
		return Math.abs(bottomRight.getX() - topLeft.getX());
	}

	public int getHeight() {
		return Math.abs(topLeft.getY() - bottomRight.getY());
	}

	public int getArea() {
		return getWidth() * getHeight();
	}

	public int getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

	public String toString() {
		return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
				", width=" + getWidth() + ", height=" + getHeight() + "]";
	}
}

