
public class PointCity extends Point{

	private String naziv;
	private double brojStanovnika;
	
	public PointCity() {
		super(0,0);
		this.naziv = "";
		this.brojStanovnika = 0;
	}
	
	public PointCity(double x, double y, String naziv, double brojStanovnika) {
		super.x = x;
		super.y = y;
		this.naziv = naziv;
		this.brojStanovnika = brojStanovnika;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Broj stanovnika je: " + this.brojStanovnika);
		System.out.println("Naziv: " + this.naziv);
	}
}
