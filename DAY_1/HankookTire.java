
public class HankookTire extends Tire{

	
	public HankookTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	public boolean roll() {
		++acc;
		if(acc<maxRotation) {
			System.out.println(location+" HankookTire ����:"+(maxRotation-acc)+" ȸ");
			return true;
		}
		else {
			System.out.println("*** "+location + "HankookTire vjdzm ***");
			return false;
		}
		
	}
}
