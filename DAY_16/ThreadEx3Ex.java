
public class ThreadEx3Ex {
	
	public static void main(String[] args) {
		
//		Thread thread = new ThreadEx3();

		Thread thread = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Thread1");
				try {Thread.sleep(509);
				}catch(Exception e) {
					System.out.println("에러발생");
				}
			}
		});
		Thread thread2 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Thread2");
				try {Thread.sleep(509);
				}catch(Exception e) {
					System.out.println("에러발생");
				}
			}
		});
		
		thread.start();
		thread2.start();
		for(int i=0; i<5; i++) {
			System.out.println("MAIN");
			try {Thread.sleep(500);
			}catch(Exception e) {
				System.out.println("에러발생");
			}
		}
	}
}

