package api_1;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals obj1 = new Equals("blue");
		Equals obj2 = new Equals("blue");
		Equals obj3 = new Equals("red");
		
		boolean a = obj1.equals2(obj2);
		boolean b = obj1==obj2;

		System.out.println(a);
		System.out.println(b);
	}

}
