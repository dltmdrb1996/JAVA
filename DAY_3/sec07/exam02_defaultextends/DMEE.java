package sec07.exam02_defaultextends;

public class DMEE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInterface1 ci1 = new ChildInterface1() {
	
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("�޼ҵ�1");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("�޼ҵ�3");
			}
		};
		
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		System.out.println();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ci2 method2 ����");
			}

			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ci2 method3 ����");
			}
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				System.out.println("����Ʈ �޼ҵ� ������");
			}
		};
		
		ci3.method2();
	}

}
