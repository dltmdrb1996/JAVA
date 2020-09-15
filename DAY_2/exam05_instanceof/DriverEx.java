package exam05_instanceof;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver lsg = new Driver();
		Vehicle vehicle = new Bus();
		Taxi taxi= new Taxi();
		lsg.Drive(vehicle);
		lsg.Drive(taxi);
		Bus bus2 = (Bus) vehicle;
		
		bus2.stop();
		
			
	}

}
