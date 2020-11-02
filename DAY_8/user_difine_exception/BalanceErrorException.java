package user_difine_exception;

public class BalanceErrorException extends Exception{
	
	public BalanceErrorException() {}
	public BalanceErrorException(String message) {
		super(message);
	}
	
	
}
