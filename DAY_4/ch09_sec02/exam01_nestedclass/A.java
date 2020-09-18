package ch09_sec02.exam01_nestedclass;

public class A {
	A(){
		System.out.println("A 按眉啊 积己凳");
	}
	
	class B{
		int filed1;
		B(){
			System.out.println("B 按眉啊 积己凳");
		}
		void method1() {};
	}
	
	static class C{
		int field1;
		static int field2;
		C(){
			System.out.println("c按眉 积己");
		}
		void methodC() {System.out.println("皋筋靛揪角青");}
		static void methodC2() {System.out.println("胶怕平皋筋靛揪角青");}
	}
	static void method() {
		class D{
			int field1;
			D(){
				System.out.println("D 按眉积己");
			}
			void method() {System.out.println(field1);}
		}
		D d = new D();
		d.field1=3;
		d.method();
	}
}
