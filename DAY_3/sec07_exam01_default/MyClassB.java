package sec07_exam01_default;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("디폴트메소드를 재정의함");
	}

}
