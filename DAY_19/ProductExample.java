
public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi_type_parameter<Tv, String> product1 = new multi_type_parameter<>();
		product1.setKind(new Tv());
		product1.setModel("Smart Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(product1.getModel());
	}

}
