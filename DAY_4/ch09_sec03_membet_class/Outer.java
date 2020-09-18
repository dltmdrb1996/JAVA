package ch09_sec03_membet_class;

public class Outer {
	String field = "outter field";
	void method() {
		System.out.println("outter method");
	}
	
	class inner{
		String field = "inner field";
		void method() {
			System.out.println("inner method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outer.this.field);
			Outer.this.method();
		}
	}
}
