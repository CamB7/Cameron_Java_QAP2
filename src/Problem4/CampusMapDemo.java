package Problem4;
import Problem2.MyPoint;
import Problem3.MyRectangle;

public class CampusMapDemo {
	public static void main(String[] args) {
		CampusMap campus = new CampusMap();

		// Create buildings
		MyRectangle scienceHall = new MyRectangle(400, 600, 600, 400);
		MyRectangle library = new MyRectangle(100, 800, 300, 600);
		MyRectangle lecture1 = new MyRectangle(700, 300, 750, 250);
		MyRectangle lecture2 = new MyRectangle(800, 300, 850, 250);
		MyRectangle lecture3 = new MyRectangle(900, 300, 950, 250);
		MyRectangle lecture4 = new MyRectangle(1000, 300, 1050, 250);
		MyRectangle lecture5 = new MyRectangle(1100, 300, 1150, 250);

		// Add buildings
		campus.addBuilding(scienceHall);
		campus.addBuilding(library);
		campus.addBuilding(lecture1);
		campus.addBuilding(lecture2);
		campus.addBuilding(lecture3);
		campus.addBuilding(lecture4);
		campus.addBuilding(lecture5);

		// Add a fountain
		MyCircle fountain = new MyCircle(new MyPoint(700, 700), 50);
		campus.addFountain(fountain);

		// Add walkways
		campus.addWalkway(scienceHall, library);
		campus.addWalkway(scienceHall, lecture1);
		campus.addWalkway(library, lecture3);
		campus.addWalkway(scienceHall, lecture5);

		// Display campus summary
		System.out.println(campus);
		System.out.printf("Total walkway length: %.2f%n", campus.calculateTotalWalkwayLength());
		System.out.printf("Total fountain area: %.2f%n", campus.calculateTotalFountainArea());

		// Check connections
		System.out.println("Is there a walkway from the Science Hall to the Library? " +
				campus.isWalkwayFromTo(scienceHall, library));

		System.out.println("Is there a walkway from the Lecture 3 to Lecture 5? " +
				campus.isWalkwayFromTo(lecture3, lecture5));
	}
}