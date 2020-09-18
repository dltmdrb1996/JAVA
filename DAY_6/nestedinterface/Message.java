package nestedinterface;


public class Message implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("메세지를보냅니다");
	}

}
