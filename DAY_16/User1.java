
public class User1 extends Thread{
	private Calculater calculater;
	
	public void setCalculator(Calculater calculater) {
		this.setName("user1");
		this.calculater = calculater;
		
	}
	@Override
	public void run() {
		calculater.setMemory(100);
	}
}
