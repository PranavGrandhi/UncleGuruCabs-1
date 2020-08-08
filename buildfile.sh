# Author - Karthik Rangasai
# Dated : 7th Nov 2019
# Shell Script to build and compile the repository.

currWorkingDir=$(pwd)
dirInCurrDir='DatabaseConnection Location Users Utilities'
numOfDir=0

# Checking for the directories.
for dir in $dirInCurrDir
do
	if [ -d $dir ]
	then
		((numOfDir++))
	fi
done

if [ $numOfDir -eq 4 ]
then
	echo Yay
else
	echo Nay
fi

# Utilities Package
echo "Building the Utilities Package"
javac Utilities/RandomGenerators.java
# Location Package
echo "Building the Location Package"
javac Location/Location.java
javac Location/PlacesLocation.java
javac Location/CustomerLocation.java
javac Location/DriverLocation.java
javac Location/RandomLocGenerator.java
# Users Package
echo "Building the Users Package"
javac Users/User.java
javac Users/InvalidPINException.java
javac Users/InadequateBankBalanceException.java
javac Users/InadequateWalletBalanceException.java
javac Users/Wallet.java
javac Users/BankAccount.java
javac Users/Cab.java
javac Users/Driver.java
javac Users/Customer.java
# Rides Package
# $(javac Rides/Request.java)
# $(javac Rides/RequestValidator.java)
# $(javac Rides/Ride.java)
# Database Connecion
echo "Building the DatabaseConnection Package"
$(javac DatabaseConnection/DatabaseConnection.java)

# Running the program:
# $(javac Demo.java)
# $(java Demo)
