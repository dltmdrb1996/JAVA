package sec07.exam02_defaultextends;

public interface ChildInterface2 extends ParentInterface , ChildInterface1{
	
	@Override
	public default void method2() {
		System.out.println("ChildInterface2 - method2() ½ÇÇà");
		
	}
}
