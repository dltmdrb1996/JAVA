package sec07.exam02_defaultextends;

public class DMEE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInterface1 ci1 = new ChildInterface1() {
	
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("메소드1");
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("메소드3");
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
				System.out.println("ci2 method2 실행");
			}

			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ci2 method3 실행");
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
				System.out.println("디폴트 메소드 재정의");
			}
		};
		
		ci3.method2();
	}

}
