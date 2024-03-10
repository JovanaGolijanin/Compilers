
public class Poruka {
	
	private String tekstPoruke;
	static public int brojKreiranihPoruka = 0;
	
	Poruka(String sadrzaj) {
		this.tekstPoruke = sadrzaj;
		brojKreiranihPoruka += 1;
	}
	
	void prikazi() {
		System.out.println(tekstPoruke);
	}
	
	public static void main(String[] args) {
		
		Poruka poruka1 = new Poruka("Prva");
		Poruka poruka2 = new Poruka("Druga");
		Poruka poruka3 = new Poruka("Treća");
		
		poruka1.prikazi();
		poruka2.prikazi();
		poruka3.prikazi();
		
		System.out.println(brojKreiranihPoruka);
	}
	
}
