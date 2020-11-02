
public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(1, "apple");
		
		boolean flag=Util3.compare(p1, p2);
		
		if(flag) {
			System.out.println("동!등!");
		}else {
			System.out.println("다름");
		}
		
		Pair<String, String> p3 = new Pair<>("hy", "apple");
		Pair<String, String> p4 = new Pair<>("bmw", "apple");
		
		boolean flag2=Util3.compare(p3, p4);
		
		if(flag2) {
			System.out.println("동!등!");
		}else {
			System.out.println("다름");
		}
	}

}
