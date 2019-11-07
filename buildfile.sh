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