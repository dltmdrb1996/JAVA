import java.applet.Applet;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(3434);
		int value = box2.get();
		System.out.println(value);
		
	}

}
