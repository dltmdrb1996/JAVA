import javax.sound.midi.Receiver;

public class EmailSand extends MessageSander{
		String message;
		String emailadrass;
	public EmailSand(String title, String name,String message,String emailadrass) {
		super(title,name);
		this.message=message;
		this.emailadrass=emailadrass;
		// TODO Auto-generated constructor stub
	}
	void sand(String rec) {
		System.out.println(rec+"에게 "+name+"가 "+message+"를 보냅니다.");
	}
	
}
