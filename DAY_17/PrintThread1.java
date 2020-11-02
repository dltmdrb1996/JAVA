
public class PrintThread1 extends Thread{	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop =stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중ㅇ`~~~~~~~~~");
		}
		System.out.println("자원을 정리리리리중ㅂ");
		System.out.println("실행종료");
	}
}
