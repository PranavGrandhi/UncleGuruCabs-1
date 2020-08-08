package Users;

abstract class User{
	private String userId, userName, phoneNumber, emailId, password;

	// Constructor
	User(String userId, String userName, String phoneNumber, String emailId, String password) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
	}


	// Getter methods
	public String getUniqueId() {
		return userId;
	}
	public String getUsername() {
		return userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}

	// Password testing for login
	boolean testLogin(String userId, String password) throws LoginErrorException{
		if((userId == this.userId) && (password == this.password)){
			return true;
		} else{
			throw new LoginErrorException();
		}
	}

	// Change password method
	void setPassword(String currentPassword, String newPassword){
		if(password.equals(currentPassword)){
			password = newPassword;
		}
	}
}