# UncleGuruCabs
Uncle Guru Cabs Pvt.Ltd.




RIDE AND REQUEST TO BE CREATED!!!!

# List of Packages:
# Driver for the program's JDBC:
* mysql-connector-java-8.0.18.jar

# 1 Users:
1) Abstarct User Class&nbsp;
* Public Customer Class -> User Class&nbsp;
	* Wallet Class - For Customer Class&nbsp;
		* InadequateWalletBalanceException&nbsp;
	* BankAccount Class - For Customer Class&nbsp;
		* InadequateBankBalanceException&nbsp;
		* InvalidPINException&nbsp;
* Public Driver Class -> User Class&nbsp;

# 2 Location:
* Abstarct Location Class&nbsp;
* Public CustomerLocation Class -> User Class&nbsp;
* Public DriverLocation Class -> User Class&nbsp;
* Random Location Generator Class&nbsp;

# 3 DatabaseConnection:
* DatabaseConnection Class&nbsp;
* Required Databases&nbsp;
	* Places Location - Pk, Place Name, X coordinate, Y coordinate&nbsp;
		* (100, 380)  - BPHC&nbsp;
		* (154, 323)  - Alankritha&nbsp;
		* (421, 206)  - Paradise&nbsp;
		* (457, 89)   - Airport&nbsp;
		* (266, 141)  - Barbeque Nation&nbsp;
		* (266, 200)  - INOX GVK One&nbsp;
		* (80, 80)    - Secunderabad Station&nbsp;
		* (400, 400)  - Hussain Sagar&nbsp;
	* BankAccount     - Pk, Balance, Pin&nbsp;
	* Cab             - Pk, Cab Number, Cab Type, Cab Charge&nbsp;
	* Customer        - Pk, Username, UniqueId EmailID, PhoneNumber, Password, walletBalance, Pk(BankAccount)&nbsp;
	* Driver          - Pk, Username, UniqueId, EmailID, PhoneNumber, Password, walletBalance, Pk(Cab)&nbsp;
	* Request         - Pk, TimeStamp, Customer, Source[Pk(Places Location)], Time(Sorted), Destination[Pk(Places Location)], Satsfied&nbsp;
		* Synchronized - Driver is Shared Resource&nbsp;
	* Ride            - Pk, Customer, Driver, Source[Pk(Places Location)], Destination[Pk(Places Location)], Duration&nbsp;
	

# 4 Utilities:
* Utilities Class&nbsp;
	* Random Wallet and Bank Balance Generators&nbsp;

# I Necessary Things to be implemented:
* HashMap for the storing locations with the coordinates&nbsp;
* Random Location allocation for Customer&nbsp;
* Random Location allocation for Drivers&nbsp;
* Random Reallocation of Driver Locations&nbsp;
* Database Tables for Customer, Driver, Location, Wallet, Ride, Bank Acc, Cab&nbsp;

# II Necessary Checks to be implemented:
* pin : BankAccount - 4 digit number&nbsp;
* rating : Driver - b/w 0 and 5&nbsp;
* cabNumber : Cab - Vehicle Number Regex, Unique&nbsp;
* In general - make constructor accept objects&nbsp;




# PROBLEMS:
* Multiple logins

new String[] { "BPHC", "Alankritha Resort", "Barbeque Nation", "Inox GVK One", "Paradise Hotel", "Secunderabad Station", "Rajiv Gandhi International Airport" })