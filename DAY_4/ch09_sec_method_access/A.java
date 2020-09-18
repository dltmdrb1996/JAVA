package ch09_sec_method_access;

public class A {
	int i;
	void method1() {}
	static int field2;
	static void method2() {}
	

	
	
	class B{
		void method() {
			i=10;
			field2 =10;
			method1();
			method2();
		}
	}
	static class C{
		void method() {
	//	i=15;
	//	method1();
		field2=10;
		method2();
		}
	}
}

