package exam02_array;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0]= new KumhoT();
		myCar.tires[1]= new KumhoT();
		
		myCar.run();
	}

}
