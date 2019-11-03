package Users;

abstract class User{
	private String uniqueId, userName, phoneNumber, emailId, password;

	User(String uniqueId, String userName, String phoneNumber, String emailId, String password) {
		this.uniqueId = uniqueId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
	}

	String getUniqueId() {
		return uniqueId;
	}
	String getUsername() {
		return userName;
	}
	String getPhoneNumber() {
		return phoneNumber;
	}
	String getEmailId() {
		return emailId;
	}
	String getPassword() {
		return password;
	}

	void setPassword(String currentPassword, String newPassword){
		if(currentPassword == password){
			password = newPassword;
		}
	}
}