
public class E {
	
	static class C{
		C(){}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	
	}
	
}

class g{
	
	E.C c = new E.C();
	
	
	void asdasda() {
		c.method1();
		System.out.println(c.field2);
	}
}