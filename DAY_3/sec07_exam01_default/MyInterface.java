package sec07_exam01_default;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("디폴트메소드실행");
	};
}
