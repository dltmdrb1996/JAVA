
public class PrintThread2 extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("角青 林快快快旷");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("历盔辆府");
		System.out.println("角青沥丰");
	}
}
