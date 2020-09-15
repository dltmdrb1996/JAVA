package sec06_ex01_implements;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsC imp= new ImplementsC();	
		
		
		InterfaceA ia = imp;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp;
		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}

}
