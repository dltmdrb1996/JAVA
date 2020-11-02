
public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+ thread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA를 생성한 스레드 : "+ thread.currentThread().getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadB를 생성한 스레드 : "+ threadB.currentThread().getName());
		threadB.start();
		
		
		System.out.println("메인쓰레드");
	}

}
