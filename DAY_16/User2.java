
public class User2 extends Thread{
private Calculater calculater;
	
	public void setCalculator(Calculater calculater) {
		this.setName("user2");
		this.calculater = calculater;
		
	}
	@Override
	public void run() {
		calculater.setMemory(50);
	}
}

