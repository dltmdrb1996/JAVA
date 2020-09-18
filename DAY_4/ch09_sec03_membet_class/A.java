package ch09_sec03_membet_class;

public class A {
	
	class B{}
	static class C{}

	B b = new B();
	C c = new C();

	void method1() {
		B b1 = new B();
		C c1 = new C();
	}
	
	//static B b2 =  new B();
	static C c2 = new C();
	
	static void method2() {
		//B b3= new B();
		C c3= new C();
		
	}
	
	
}
