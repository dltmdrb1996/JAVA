package api_1;


public class Equals {
	public String id;
	public Equals(String id) {
		this.id=id;
	}
	
	public boolean equals2(Object obj) {
		if(obj instanceof Equals) {
			Equals obj2 = (Equals)obj;
			if(id.equals(obj2.id)) {
				return true;
			}
		}
		return false;
	}
}
