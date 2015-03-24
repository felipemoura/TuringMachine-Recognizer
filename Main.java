import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	// Constants
	private static final int ACCEPT 	= 1;
	private static final int REJECT 	= 2;
	private static final int DONTKNOW 	= 3;
	private static final int UNKOWN		= -1;

	// Variables
	private static Scanner s;
	private static String string = new String ("");
	private static LinkedList <String> states = new LinkedList<String>();

	// Turing machine
	private static TuringMachine tm = null;
	
	public static void main(String[] args) {
		s = new Scanner (System.in);

		// Read the regular expression
		String line = s.nextLine();		
		
		// Closing Scanner
		if (s != null) {	s.close();	}
		
		// Split the input
		String [] str = line.split("#");

		// Add the states to the linked list
		for (int i = 0 ; i < (str.length - 1); i++) {
			// The split may have string with no character (noise)
			if (str[i].length() > 1) {
				states.addLast(str[i]);
			}
		}

		// Set the string to validate after generating the TM
		// Check if its empty string or not
		setString ( (str [str.length - 1].compareTo("e") == 0 ) ? "" : str[str.length - 1]);
		
		// Generate the Turing machine
		setTm ( TuringMachineCreator.generateTuringMachine (states) );

		// Get option after execution of the string in the Turing machine
		int option = Execute.evaluateString ( getTm(), getString () );

		switch (option) {
			case ACCEPT:
				System.out.println("M stops and accepts w");
				break;
			case REJECT:
				System.out.println("M stops and rejects w");
				break;
			case DONTKNOW:
				System.out.println("Do not know");
				break;
			default:
				System.out.println("Unkown option");
				System.exit(0);
				break;
		}
		// End of program
	}

	// Getters and setters
	public static String getString() {
		return string;
	}

	public static void setString(String string) {
		Main.string = string;
	}

	public static int getAccept() {
		return ACCEPT;
	}

	public static int getReject() {
		return REJECT;
	}

	public static int getDontknow() {
		return DONTKNOW;
	}

	public static TuringMachine getTm() {
		return tm;
	}

	public static void setTm(TuringMachine tm) {
		Main.tm = tm;
	}

	public static int getUnkown() {
		return UNKOWN;
	}
}
// This line make it work