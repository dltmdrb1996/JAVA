package systemex;

public class GcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gc emp;
		emp = new Gc(1);
		
		emp=null;
		emp= new Gc(2);
		emp= new Gc(3);
		
		System.out.println("emp�� ���������� �����ϴ� �����ȣ��");
		System.out.println(emp.eno);
		System.gc();
	}

}
