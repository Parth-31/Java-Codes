
public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		System.out.println(p1);
		Point p2 = new Point(2,2);
		System.out.println(p2);
		Point p3 = new Point();
		System.out.println(p3);
		
		p1.setX(4);
		p1.setY(4);
		System.out.println(p1);
		System.out.println("X is:" + p1.getX());
		System.out.println("Y is:" + p1.getY());
		
		p1.setXY(10, 10);
		System.out.println("X is:" + p1.getXY()[0]);
		System.out.println("Y is:" + p1.getXY()[1]);
		
		p2.setXY(30, 20);
		
		System.out.printf("Distance is: %.2f%n", p1.distance(10, 10));
		System.out.printf("Distance is: %.2f%n", p1.distance(p2));
		System.out.printf("Distance is: %.2f%n", p2.distance(p1));
		System.out.printf("Distance is: %.2f%n", p1.distance());
	}

}
