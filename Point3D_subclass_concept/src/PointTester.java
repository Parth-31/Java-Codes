import java.awt.*;
public class PointTester {
	
	public static void main(String[] args){
		
		Point object1 = new Point(11,22);
		Point3D object2 = new Point3D(7,6,64);
		
		System.out.println("2D point is at: (" + object1.x + "," + object1.y +")" );
		object1.move(5, 5);
		System.out.println("After using Point.move, point is at (" + object1.x + "," + object1.y +")" );
		object1.translate(-5, -5);
		System.out.println("After using Point.translate, point is at (" + object1.x + "," + object1.y +")" );
		
		
		System.out.println("3D point is at: (" + object2.x + "," + object2.y + "," + object2.z + ")" );
		object2.move(10, 10, 10);
		System.out.println("After using Point3D.move: (" + object2.x + "," + object2.y + "," + object2.z + ")" );
		object2.translate(5, 5, 5);
		System.out.println("After using Point3D.translate: (" + object2.x + "," + object2.y + "," + object2.z + ")" );
	}
	
	

}
