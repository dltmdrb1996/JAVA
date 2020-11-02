
public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();
		
		ThreadC threadC = new ThreadC(sharedObject);
		ThreadD threadD = new ThreadD(sharedObject);
		
		threadC.start();
		threadD.start();
	}

}
