package exam02_array;

public class Car {
	Tire[] tires= {
			new HanTire(),
			new HanTire(),
			new HanTire(),
			new HanTire()
	};
	
	void run() {
		for(Tire tire: tires) {
			tire.roll();
		}
	}
}
