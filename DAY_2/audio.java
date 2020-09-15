
public class audio implements RemoteControl{
	private int volume=0;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("audio¸¦ ÄÕ´Ï´Ù");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("audio¸¦ ²ü´Ï´Ù");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>MAX_VOLUME) 
			this.volume=MAX_VOLUME;	
		else if(volume<MIN_VOLUME)
			this.volume=MIN_VOLUME;
		else
			this.volume=volume;
		System.out.println("ÇöÀç audio º¼·ý :"+this.volume);
	}
	
}
