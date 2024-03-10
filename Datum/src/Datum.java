
public class Datum {
	
	private int dan;
	private int mesec;
	
	static public boolean prestupna = true;
	
	public void postavi(int dan, int mesec) {
		this.dan = dan;
		this.mesec = mesec;
	}
	
	public void prikazi() {
		System.out.println(dan + "/" + mesec);
	}
	
	public static int brojDana(int mesec) {
		switch(mesec)
		{
			case 01:
			return 31;
					
		}
		return 0;
			
	}
}
