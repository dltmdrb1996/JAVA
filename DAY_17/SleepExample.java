
public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try {
			Thread.sleep(3000);
			}catch(InterruptedException e) {}
		}
	}

}
