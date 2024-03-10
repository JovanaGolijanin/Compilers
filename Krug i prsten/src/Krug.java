
public class Krug {

	protected double poluprecnik;
	
	Krug(double pp){
		this.poluprecnik = pp;
	}
	
	public double povrsina() {
		double povrsina = 0;
		povrsina = 2*this.poluprecnik*3.14;
		return povrsina;
	}
	
	public static void main(String[] args) {
		Krug k = new Krug(2);
		System.out.println(k.povrsina());
		
	}
}
