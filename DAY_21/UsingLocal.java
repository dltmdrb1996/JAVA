
public class UsingLocal {
	
	void method(int arg) {
		int localVar=40;
		
		
		MyFunctionalInterface4 fi= () ->{
			System.out.println("arg:"+arg);
			System.out.println("localVar:"+localVar);
		};
	}
}
