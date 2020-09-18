package nestedinterface;

public class Call implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("전화를 겁니다");
	}
	
}
