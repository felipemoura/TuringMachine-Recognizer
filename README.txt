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