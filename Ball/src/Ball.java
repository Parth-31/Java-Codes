
public class Ball {
	
	private double x,y,xStep,yStep;
	
	public Ball(double x, double y, double xStep, double yStep){
		this.x = x;
		this.y = y;
		this.xStep = xStep;
		this.yStep = yStep;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getXStep(){
		return this.xStep;
	}
	
	public double getYStep(){
		return this.yStep;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public void setXStep(double xStep){
		this.xStep = xStep;
	}
	
	public void setYStep(double yStep){
		this.yStep = yStep;
	}
	
	public String toString(){
		return String.format("Ball @(%.2f,%.2f), Speed=(%.2f,%.2f)",x,y,xStep,yStep);
	}
	
	public double[] getXY(){
		double[] XY = {this.x,this.y};
		return XY;
	}
	
	public double[] getXYStep(){
		double[] XYStep = {this.xStep,this.yStep};
		return XYStep;
	}
	public void setXY(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setXYStep(double xStep, double yStep){
		this.xStep = xStep;
		this.yStep = yStep;
	}
	
	public Ball move(){
		x += xStep;
		y += yStep;
		return this;
	}
}
