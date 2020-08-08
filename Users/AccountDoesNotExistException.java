package Users;

class AccountDoesNotExistException extends Exception{
	private String message = "Account doesn't exist, please create an account !";
	AccountDoesNotExistException(){
		super();
	}
}