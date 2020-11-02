package user_difine_exception;

public class Account {
	private long balance;
	
	public Account() {}

	public long getBalace() {
		return balance;
	}
	
	public void deposit(int money) {
		balance +=money;
	}
	public void withdraw(int money) throws BalanceErrorException {
		if(balance<money) {
			throw new BalanceErrorException("잔고가 부족합니다.");
		
		}
		else
		balance -=money;
		
	}
}
