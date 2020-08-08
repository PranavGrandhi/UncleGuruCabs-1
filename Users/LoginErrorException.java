package Users;

class LoginErrorException extends Exception{
	private String message = "Invalid Credentials! Please try again.";
	LoginErrorException(){
		super();
	}
}