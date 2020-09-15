package ex_account;

public class Account {
	private int money;
	private int debt;


	void setMoney(int money) {
		this.money+=money;
	}
	int getMoney() {
		return this.money;
	}
}