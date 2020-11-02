
public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater calculater = new Calculater();
		User1 user1 = new User1();
		user1.setCalculator(calculater);
		user1.start();
	
		User2 user2 = new User2();
		user2.setCalculator(calculater);
		user2.start();
	}
	
	

}
