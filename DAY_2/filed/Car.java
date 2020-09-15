package filed;

public class Car {
	
	Tire frontL = new HanTire();
	Tire forntR = new HanTire();
	Tire backL = new HanTire();
	Tire backR = new HanTire();

	void run() {
		frontL.roll();
		forntR.roll();
		backL.roll();
		backR.roll();
	}
}
