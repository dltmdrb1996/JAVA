package ex_multple;

public class SmartTelevison implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"을 검색합니다");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
