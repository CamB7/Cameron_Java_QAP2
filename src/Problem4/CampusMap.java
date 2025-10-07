package Problem4;
import Problem2.MyLine;
import Problem2.MyPoint;
import Problem3.MyRectangle;
import java.util.ArrayList;

public class CampusMap {

	private ArrayList<MyLine> walkways;
	private ArrayList<MyRectangle> buildings;
	private ArrayList<MyCircle> fountains;

	public CampusMap() {
		walkways = new ArrayList<>();
		buildings = new ArrayList<>();
		fountains = new ArrayList<>();
	}

	// Add a new building to the map
	public void addBuilding(MyRectangle building) {
		buildings.add(building);
	}

	// Add a fountain (circle)
	public void addFountain(MyCircle fountain) {
		fountains.add(fountain);
	}

	// Connect two buildings with a walkway line
	public void addWalkway(MyRectangle from, MyRectangle to) {
		if (!buildings.contains(from) || !buildings.contains(to)) {
			System.out.println("Error: One or both buildings are not on the campus map.");
			return;
		}
		MyLine path = new MyLine(from.getCenter(), to.getCenter());
		walkways.add(path);
	}

	// Total walkway length
	public double calculateTotalWalkwayLength() {
		double total = 0;
		for (MyLine line : walkways) {
			total += line.getLength();
		}
		return total;
	}

	// Total fountain area
	public double calculateTotalFountainArea() {
		double total = 0;
		for (MyCircle circle : fountains) {
			total += circle.getArea();
		}
		return total;
	}

	// Check if walkway exists between two buildings
	public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding) {
		MyPoint fromCenter = fromBuilding.getCenter();
		MyPoint toCenter = toBuilding.getCenter();

		for (MyLine walkway : walkways) {
			MyPoint start = walkway.getBegin();
			MyPoint end = walkway.getEnd();

			boolean sameLine =
					((start.getX() == fromCenter.getX() && start.getY() == fromCenter.getY()) &&
							(end.getX() == toCenter.getX() && end.getY() == toCenter.getY())) ||
							((start.getX() == toCenter.getX() && start.getY() == toCenter.getY()) &&
									(end.getX() == fromCenter.getX() && end.getY() == fromCenter.getY()));

			if (sameLine) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		return "CampusMap: " + buildings.size() + " buildings, " +
				fountains.size() + " fountains, " +
				walkways.size() + " walkways.";
	}
}

