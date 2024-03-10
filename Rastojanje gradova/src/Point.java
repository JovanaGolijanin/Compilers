
public class Point {
	
	protected double x;
	protected double y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static double rastojanje(Point p1, Point p2) {
		double prvi = (p2.x-p1.x)*(p2.x-p1.x);
		double drugi = (p1.y-p2.y)*(p1.y-p2.y);
		return Math.sqrt(prvi+drugi);
	}
	
	public void printData() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}

}
