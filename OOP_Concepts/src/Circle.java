
public class Circle {
	private int radius;
	private String color;
	
	public Circle() {
		radius = 15;
		color = "Blue";
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	public int getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public String toString(){
		
		return "Radius: " + radius + " \n" + "Color: " + color;
	}
}


