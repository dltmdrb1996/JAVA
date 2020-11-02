
public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadAEx TA = new ThreadAEx();
		ThreadBEx2 TB = new ThreadBEx2();
		
		TA.start();
		TB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		TA.work=false;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		TA.work=true;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		TA.stop=true;
		TB.stop=true;
		
		
	}	

}
