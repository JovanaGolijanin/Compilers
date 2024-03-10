
public class Glavna {
	
	public static void main(String[] args) {
		Point tacka1 = new Point(1,2);
		Point tacka2 = new Point(2,1);
		System.out.println(Point.rastojanje(tacka1, tacka2));
		tacka1.printData();
		tacka2.printData();
		
		PointCity nis = new PointCity(1,2, "Nis", 15000);
		PointCity bg = new PointCity(2,1, "Beograd", 15000);
		System.out.println(Point.rastojanje(nis, bg));
	}
}
