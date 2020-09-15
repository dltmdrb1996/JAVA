
public class remoteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		RemoteControl rc2;
		rc2= new Television();
		rc= new audio();
		
		rc.turnOff();
		rc2.turnOff();
		rc2.setVolume(16);
	}

}
