
public class PrintThread1 extends Thread{	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop =stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("�����ߤ�`~~~~~~~~~");
		}
		System.out.println("�ڿ��� �����������ߤ�");
		System.out.println("��������");
	}
}
