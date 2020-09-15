package ex_multple;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SmartTelevison stv= new SmartTelevison();
			RemoteControl rc = stv;
			Searchable sc= stv;
			rc.turnOn();
			sc.search("http://www.naver.com");
			
	}

}
