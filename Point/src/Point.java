
public class Point {
	
	private int x = 0, y = 0;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public String toString(){
		return String.format("(%d,%d)",x,y);
	}
	
	public int[] getXY(){
		int[] XY = {this.x,this.y};
		return XY;
	}
	
	public void setXY(int x,int y){
		this.x = x;
		this.y = y;
	}	
		
	public double distance(int x,int y){
		return Math.sqrt((Math.pow((this.x - x),2))+ (Math.pow((this.y - y),2)));
	}	
	
	public double distance(Point another){
		return Math.sqrt((Math.pow((this.x - another.x),2))+ (Math.pow((this.y - another.y),2)));
		}
	
	public double distance(){
		return Math.sqrt((Math.pow((this.x),2))+ (Math.pow((this.y),2)));
	}
}
