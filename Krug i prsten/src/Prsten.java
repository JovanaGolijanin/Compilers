
public class Prsten extends Krug {
	
	double unutrasnjiPP;
	Prsten(double pp, double unutrasnjiPP){
		super(pp);
		this.unutrasnjiPP = unutrasnjiPP;
	}

	public double povrsina()
	{
		double povrsinaCelog;
		double povrsinaUnutrasnjeg;
		povrsinaCelog = super.poluprecnik * super.poluprecnik * 3.14;
		povrsinaUnutrasnjeg = unutrasnjiPP * unutrasnjiPP * 3.14;
		return povrsinaCelog - povrsinaUnutrasnjeg;
	}
}
