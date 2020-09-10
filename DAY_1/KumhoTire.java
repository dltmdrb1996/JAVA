
public class KumhoTire extends Tire{
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	public boolean roll() {
		++acc;
		if(acc<maxRotation) {
			System.out.println(location+"KumhoTire 수명:"+(maxRotation-acc)+" 회");
			return true;
		}
		else {
			System.out.println("*** "+location + "KumhoTire 수명 ***");
			return false;
		}
		
	}
}
