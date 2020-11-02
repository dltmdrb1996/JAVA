package s_throws;

public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		findClass();
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
	
		Class clazz = Class.forName("java.lang.String2");

	}
}
