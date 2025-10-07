package Problem4;
import Problem2.MyPoint;

public class MyCircle {
	private MyPoint center = new MyPoint();
	private int radius = 1;
	MyCircle()
	{
		this.center = new MyPoint();
		this.radius = 1;
	}
	MyCircle(int x, int y, int r)
	{
		this.center = new MyPoint(x,y);
		this.radius = r;
	}
	MyCircle(MyPoint p, int r)
	{
		this.center = p;
		this.radius = r;
	}
	public void setRadius(int r)
	{
		this.radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public MyPoint getCenter() {
		return center;
	}
	public int getCenterX()
	{
		return this.center.getX();
	}
	public void setCenterX(int x)
	{
		this.center.setX(x);

	}
	public int getCenterY()
	{
		return this.center.getY();
	}
	public void setCenterY(int y)
	{
		this.center.setY(y);

	}
	public void setCenterXY(int x, int y)
	{
		this.center.setXY(x, y);
	}
	public int[] getCenterXY()
	{
		int a[] = new int[2];
		a[0] = this.center.getX();
		a[1] = this.center.getY();
		return a;
	}
	public String toString()
	{
		return ("Center = " + this.center + " and radius = " + this.radius);
	}
	public double getArea()
	{
		return (Math.PI * this.radius * this.radius);
	}
	public double getCircumference()
	{
		return (2 * Math.PI * this.radius);
	}
	public double distance(MyCircle c1)
	{

		return (this.center.distance(c1.center));
	}

}

