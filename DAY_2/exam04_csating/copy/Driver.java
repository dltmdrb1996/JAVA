package exam04_csating.copy;

public class Driver {

	
	public void Drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
		Bus bus= (Bus) vehicle;
		bus.stop();
		}
		vehicle.run();
	}
}
