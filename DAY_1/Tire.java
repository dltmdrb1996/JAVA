	
public class Tire {
	
	public int maxRotation;
	public int acc;
	public String location;
	
	
	public Tire(String location,int maxRotation) {
		this.location=location;this.maxRotation=maxRotation;
	}
	
	public boolean roll() {
		++acc;
		if(acc<maxRotation) {
			System.out.println(location + " tire ����:"+(maxRotation-acc)+"ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+"Tire ��ũ ***");
			return false;
		}
	}
}
