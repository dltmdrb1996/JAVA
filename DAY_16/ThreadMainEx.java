
public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+ thread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA�� ������ ������ : "+ thread.currentThread().getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadB�� ������ ������ : "+ threadB.currentThread().getName());
		threadB.start();
		
		
		System.out.println("���ξ�����");
	}

}
