package ex_account;

public class loan implements Back_Account {
	
	int money=100000;
	@Override
	public void deposit(int account) {
		// TODO Auto-generated method stub
		money-=account;
		System.out.println("ÇöÀç ºûÀº"+this.money);
	}

	@Override
	public void withdraw(int account) {
		// TODO Auto-generated method stub
		money+=account;
		System.out.println("ÇöÀç ºûÀº"+this.money);
	}

}
