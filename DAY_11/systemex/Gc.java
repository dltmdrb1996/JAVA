package systemex;

public class Gc {
	public int eno;
	
	public Gc(int eno) {
		this.eno=eno;
		System.out.println("Employee(" + eno + ")�� �޸𸮿��� ������");
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("employee("+eno+")�� �޸𸮿��� ���ŵ�");
	}
}
