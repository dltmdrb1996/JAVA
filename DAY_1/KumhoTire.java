
public class KumhoTire extends Tire{
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	public boolean roll() {
		++acc;
		if(acc<maxRotation) {
			System.out.println(location+"KumhoTire ����:"+(maxRotation-acc)+" ȸ");
			return true;
		}
		else {
			System.out.println("*** "+location + "KumhoTire ���� ***");
			return false;
		}
		
	}
}
