
public class PrintThread2 extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("���� �ֿ����");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("��������");
		System.out.println("��������");
	}
}