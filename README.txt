README.txt

@author Felipe Moreira Moura
@NUID	59797811
@course	Computer Engineering
@class	CSCE 428 - Project 02: Turing Machine

Files:
	* MakeFile
	* Java classes
		* Execute.java
		* Main.java
		* State.java
		* Tape.java
		* TapeTree.java
		* Transition.java
		* TuringMachine.java
		* TuringMachineCreator.java

Input Strint to Turing Machine:
	* The following functions in TuringMachineCreator converts the input string into a turing Machine
		* TuringMachineCreator.generateTuringMachine()
		* TuringMachineCreator.getInformation()

Execute the Turing Machine :
	* The follwoing functions in Execute execute the created Turing Machine
		* Execute.evaluateString()
		* Execute.generateTree()
		* Execute.replaceAtCharPosition()

Main clas:
	* The main class will read the input and store the information into variables and then call the 
	  TuringMachineCreator to get the turing machine. After that It calls the Execute class to see if the 
	  string in the input is accepted, rejected or do not know.

Compiling:
	* To compile it just use "make", it will compile all java files with javac.

Runing:
	* "make run" will run it DO NOT FORGET TO COMPILE FIRST !!!
	* You can run the program by typing it in the standard I/O.
	* You can run the program by FILE REDIRECTION only if the file contains only ONE LINE up to 1024 Characters
	

Results:
	* Wait about 1 seconds for the turing machine to show the results. If the string is accpet or not or don't know
		* If the string is accepted the program will output "M stops and accepts w"
		* If the string is not accepted the program will output "M stops and rekects w"
		* If the string runs more than 20 transitions in the turing machine the progrma will output "Do not know"

Cleanning:
	* "make clean" will rm all ".class" files

Zip:
	* "make zip" will zip all files in one zip file