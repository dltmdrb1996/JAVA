

public class WorkObject {

	public synchronized void methodC() {
		System.out.println("ThreadC�� methodC()�۾�����");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void methodD() {
		System.out.println("ThreadD�� methodD()�۾�����");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
}
