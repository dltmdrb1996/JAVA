
public class ThreadEx3 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(499);
			}catch(Exception e) {
				System.out.println("�����߻�");
			}
		}
	}
	

}
