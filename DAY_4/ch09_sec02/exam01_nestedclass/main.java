package ch09_sec02.exam01_nestedclass;

import ch09_sec02.exam01_nestedclass.A.B;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* �ν��Ͻ� �ɹ� Ŭ���� ���*/
		A a = new A();
		A.B b = a.new B();
		b.filed1 = 3;
		b.method1();
		
		/* ���� �ɹ� Ŭ���� ���*/
		A.C c = new A.C();
		c.methodC();
		A.C.methodC2();
		c.field1=5;
		A.C.field2=10;
		
		a.method();
	}

	
}
