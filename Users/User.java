package Users;

abstract class User{
	private String uniqueId, userName, phoneNumber, emailId, password;

	// Constructor
	User(String uniqueId, String userName, String phoneNumber, String emailId, String password) {
		this.uniqueId = uniqueId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
	}


	// Getter methods
	public String getUniqueId() {
		return uniqueId;
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
	boolean testPassword(String password) {
		return (password == this.password);
	}

	// Change password method
	void setPassword(String currentPassword, String newPassword){
		if(currentPassword == password){
			password = newPassword;
		}
	}
}