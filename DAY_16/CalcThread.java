
public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0;  i<2000000000;i++) {
			for(int j=0;  j<2000000000;j++) {
				for(int a=0;  a<20;a++) {	
				}
			}
		}
		System.out.println(getName());
	}
}
