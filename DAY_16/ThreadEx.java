import java.awt.Toolkit;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable car = new CarTask();
		Thread thread = new Thread(car);
		
		Thread thread2 = new Thread( () ->{ 	
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
		});   
		thread2.start();
		for(int i=0;i<500;i++) {
			System.out.println("|  :  |");
			try {
				Thread.sleep(100);
			}catch(Exception e){}
			System.out.println("|  :  |");
			try {
				Thread.sleep(100);
			}catch(Exception e){}
		}
		
		
	}

}
