class InadequateBankBalanceException extends Exception{
	private String message = "Bank Balance isn't enough to make a trnasaction";
	InadequateWalletBalance(){
		super();
	}
}