
public class Calculater {
	private int memory;
	
 	synchronized void setMemory(int memory) {
		this.memory=memory;
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ " : " + this.memory);

	}
	
	int getMemory() {
		return this.memory;
		
	}
}
