
public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		this.setPriority(10);
		for(int i=0;i<2;i++) {
			System.out.println(getName()+ "가 출력한 내용");
		}
	}
}
