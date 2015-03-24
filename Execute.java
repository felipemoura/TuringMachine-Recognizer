import java.util.ArrayList;

public class Execute {

	public static int evaluateString(TuringMachine turingMachine, String target) {

		// Initialize the tape on the root
		Tape rootTape = new Tape (target, 0);
		rootTape.setCurrentState(turingMachine.getTuringMachine().get("q0"));

		// Initialize the tree of tape
		TapeTree root = new TapeTree (rootTape, 0, false);

		generateTree (root, turingMachine);

		// Check the answer of this Turing machine model
		if (TapeTree.isAccepted()) {
			return Main.getAccept();
		} else if (TapeTree.getCurrentDepth() >= 20) {
			return Main.getDontknow();
		} else if (TapeTree.getCurrentDepth() <= 19 && !TapeTree.isAccepted()) {
			return Main.getReject();
		} else {
			return Main.getUnkown();
		}
	}

	private static void generateTree(TapeTree node, TuringMachine tm) {
		// Case of return
		if (TapeTree.isAccepted() || node == null  || (node.getDepth() >= 20) || node.isRejected()) {
			return;
		}

		String strTape =  node.getTape().getTape();
		char c = ' ';

		if (node.getTape().getCurrenPosition() > (strTape.length() - 1)) {
			c = '_';
		} else {
			c = strTape.charAt(node.getTape().getCurrenPosition());
		}

		// Get all transitions for the first symbol
		ArrayList<Transition> transitions = node.getTape().getCurrentState().getTransition().get(c);

		// this node died and set rejected because there is no transitions
		if (transitions == null) {	
			node.setRejected(true);
			return;	
		}

		// Create node for each transition in the current state
		for (Transition t : transitions) {
			String aux 			= node.getTape().getTape();
			int currentPosition = node.getTape().getCurrenPosition();

			// Get information about the transition
			char move 		 = t.getMove();
			char replace 	 = t.getReplace();
			String nextState = t.getNextState();

			// Change the char in the tape
			aux = replaceAtCharPosition (aux, replace, currentPosition);

			// Move the tape
			if (move == 'R') {
				currentPosition++;
			} else {
				if (currentPosition >= 1) {	currentPosition--;	}
			}

			// Create new node
			Tape tape = new Tape (aux, currentPosition);
			tape.setCurrentState(tm.getTuringMachine().get(nextState));

			// Add the node to the tree and check if it is a reject state
			TapeTree tapeTree = new TapeTree (tape, node.getDepth() + 1, (nextState.compareTo("qr") == 0) ? true : false);
			
			// Update the depth of this tree
			TapeTree.updateDepth (node.getDepth() + 1);

			// Found 1 accept string, start return
			if (nextState.compareTo("qa") == 0) {
				TapeTree.setAccepted(true);
				return;
			}
			
			node.getTapeTree().addLast(tapeTree);
		}

		// Run the transition recursively for each new transition
		for (TapeTree tt : node.getTapeTree()) {
			generateTree (tt, tm);
		}
	}

	// Change the char in the desired position
	public static String replaceAtCharPosition (String str, char replace, int position) {
		if (position > (str.length() - 1) ) {	str += " ";	}

		char[] charArray = str.toCharArray();
		charArray[position] = replace;

		return new String(charArray);
	}
}
// This line make it work