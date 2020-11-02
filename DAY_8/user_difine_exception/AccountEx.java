package user_difine_exception;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.deposit(10000);
		System.out.println("¿¹±Ý ÀÜ¾× = "+account.getBalace());
	
		try {
			account.withdraw(15000);
			System.out.println("¿¹±Ý ÀÜ¾× = "+account.getBalace());
		} catch (BalanceErrorException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}			
		
	}
}
