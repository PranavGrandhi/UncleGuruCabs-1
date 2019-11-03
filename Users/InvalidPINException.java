class InvalidPINException extends Exception{
	private String message = "Please enter a valid PIN";
	InvalidPINException(){
		super();
	}
}