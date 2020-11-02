import java.awt.Stroke;

public class ChildProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass<Tv, String, String> product = new ChildClass<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImp1<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		
		
	}

}
