
public class PhoneMessage extends MessageSander{
	String message;
	String tellNumber;
	public PhoneMessage(String title, String name,String message,String tellNumber) {
		super(title,name);
		this.message=message;
		this.tellNumber=tellNumber;
	// TODO Auto-generated constructor stub
}
	void sand(String rec) {
		System.out.println(rec+"���� "+name+"�� "+message+"�� �����ϴ�.");
}

}
