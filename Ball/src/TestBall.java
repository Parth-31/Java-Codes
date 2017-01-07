
public class TestBall {
	public static void main(String[] args){
		Ball b1 = new Ball(5,5,1,1);
		System.out.println(b1);
		b1.setX(3);
		b1.setY(4);
		b1.setXStep(13);
		b1.setYStep(14);
		System.out.println(b1);
		System.out.println("x is: " + b1.getX());
		System.out.println("y is: " + b1.getY());
		System.out.println("xStep is: " + b1.getXStep());
		System.out.println("yStep is: " + b1.getYStep());
		b1.setXY(11, 22);
		b1.setXYStep(11, 11);
		System.out.println(b1);
		System.out.println("x is: " + b1.getXY()[0]);
		System.out.println("y is: " + b1.getXY()[1]);
		System.out.println("xStep is: " + b1.getXYStep()[0]);
		System.out.println("yStep is: " + b1.getXYStep()[1]);
		System.out.println(b1.move());
		System.out.println(b1.move().move().move());
		
	}
}
