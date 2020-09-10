
public abstract class MessageSander {
	String title;
	String name;
	
	public MessageSander(String title, String name) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.name=name;
	}
	abstract void sand(String recipient);
	
		
}

