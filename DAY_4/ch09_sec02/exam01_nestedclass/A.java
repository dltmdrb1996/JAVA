package ch09_sec02.exam01_nestedclass;

public class A {
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	class B{
		int filed1;
		B(){
			System.out.println("B ��ü�� ������");
		}
		void method1() {};
	}
	
	static class C{
		int field1;
		static int field2;
		C(){
			System.out.println("c��ü ����");
		}
		void methodC() {System.out.println("�޽�徾����");}
		static void methodC2() {System.out.println("����ƽ�޽�徾����");}
	}
	static void method() {
		class D{
			int field1;
			D(){
				System.out.println("D ��ü����");
			}
			void method() {System.out.println(field1);}
		}
		D d = new D();
		d.field1=3;
		d.method();
	}
}
