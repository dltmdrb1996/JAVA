package ex_account;

public class Transaction implements Back_Account{
	private int money;
	@Override
	public void deposit(int account) {
		// TODO Auto-generated method stub
		this.money+=account;
		System.out.println("현재잔액은"+this.money);
	}

	public void withdraw(int account) {
		// TODO Auto-generated method stub
		if(account<=money)
			a.setMoney(a.getMoney()-account);
		else
			this.money=0;
		System.out.println("현재잔액은+this.money");
	}
	
}
