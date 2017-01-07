
public class TestCircle {
	public static void main(String[] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle(20);
		Circle c3 = new Circle(30,"Red");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		System.out.println(c2.getRadius());
		System.out.println(c2.getColor());
		System.out.println(c3.getRadius());
		System.out.println(c3.getColor());
		
		c1.setRadius(50);
		c1.setColor("Yelow");
		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		
		
		
		
	}
}
