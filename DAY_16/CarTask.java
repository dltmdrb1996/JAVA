
public class CarTask implements Runnable{
		// TODO Auto-generated method stub
	public void run() {
		for(int i=0; i<50; i++) {
			
			System.out.println("| ___ |");
			System.out.println("||   ||");
			System.out.println("||___||");
			System.out.println("||car||");
			System.out.println("||___||");
			System.out.println("||___||");
			try {Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
