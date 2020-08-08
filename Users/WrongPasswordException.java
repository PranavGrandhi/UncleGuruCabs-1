package Users;

class WrongPasswornException extends Exception{
	private String message = "Invalid Password. Please try again !";
	WrongPasswornException(){
		super();
	}
}