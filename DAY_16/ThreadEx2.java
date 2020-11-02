
public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int b=30;
//		Thread Thread1 = new Thread( ()-> {
//			int a=1;
//			while(true) {
//				System.out.println(a);
//				if(a>=100) {
//					System.out.println("쓰레드1종료");
//					break;	
//				}
//				a++;
//				try{Thread.sleep(1000);
//				}catch(Exception e) {}
//			}
//		} );
//		Thread1.start();
//		
//		while(true) {
//			System.out.println(b);
//			if(b>=100) {
//				System.out.println("쓰레드2종료");
//				break;
//			}
//			b=b+2;
//			try{Thread.sleep(1000);
//			}catch(Exception e) {}
//		}
		int  a=1; int b=30;
		for(int i=0;i<100;i++) {
			if(a<100) {
			System.out.println(a);
			a=a+2;
			}else if(a>=100) {
				System.out.println("쓰레드1 종료");
				a=-1;
			}
			if(b<100) {
			System.out.println(b);
			b++;
			}else if(b>=100) {
				System.out.println("쓰레드 2종료");
				b=-1;
			}
			
			 
			
			try {Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
