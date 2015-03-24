import java.util.ArrayList;
import java.util.LinkedList;

public class TuringMachineCreator {

	public static TuringMachine generateTuringMachine (LinkedList<String> states) {
		// Turing Machine
		TuringMachine tm = new TuringMachine ();

		// Variables
		String [] information = null;
		String [] information2 = null;

		String stateID = null;
		String input = null;
		String replace = null;
		String move = null;
		String nextState = null;
		
		State state = null;
		
		Transition transition = null;

		ArrayList <Transition> temp = null;
		
		// Generate the states in the turing machine and add transition
		for (String str : states) {
			information = getInformation (str, ",");
			information2 = getInformation (information[1], "->");

			stateID 	= information[0];
			
			input 		= information2[0];
			nextState 	= information2[1];
			
			replace		= information[2];
			move		= information[3];

			state = tm.getTuringMachine().get(stateID);
			
			// Create state if it does not exists
			if (state == null) {
				state = new State (stateID, false, false);
				tm.getTuringMachine().put(stateID, state);
			} 
			
			// Add transition to the state
			transition = new  Transition(input.charAt(0), replace.charAt(0), move.charAt(0), nextState);
		
			// Add transition to the arraylist of transitions
			if (state.getTransition().containsKey(transition.getInput())) {
				temp = state.getTransition().get(transition.getInput());
				temp.add(transition);
			
			// Else create the arraylist of transitions
			} else {
				temp = new ArrayList<Transition> ();
				temp.add(transition);
				
				state.getTransition().put(transition.getInput(), temp);
			}		
		}
		
		// Adding Reject and Accept State to The Turing machine
		state = new State ("qa", true, false);
		tm.getTuringMachine().put("qa", state);
		
		state = new State ("qr", false, true);
		tm.getTuringMachine().put("qr", state);
	
		// Return the TM created
		return tm;
	}

	// Get information about the input
	private static String [] getInformation (String string, String key) {
		return string.split(key);
	}
}
// This line make it work