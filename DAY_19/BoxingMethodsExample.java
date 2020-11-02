
public class BoxingMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util3.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util3.boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
