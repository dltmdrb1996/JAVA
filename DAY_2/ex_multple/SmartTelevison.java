package ex_multple;

public class SmartTelevison implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"�� �˻��մϴ�");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv���մϴ�");
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
