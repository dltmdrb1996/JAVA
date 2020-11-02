package systemex;

public class Gc {
	public int eno;
	
	public Gc(int eno) {
		this.eno=eno;
		System.out.println("Employee(" + eno + ")이 메모리에서 생성됨");
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("employee("+eno+")가 메모리에서 제거됨");
	}
}
