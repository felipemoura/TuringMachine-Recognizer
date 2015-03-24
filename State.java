import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class State {
	private String stateID;
	private Map<Character, ArrayList<Transition>> transition;
	private boolean acceptState;
	private boolean rejectState;
	
	public State(String stateID, boolean acceptState, boolean rejectState) {
		super();
		this.stateID = stateID;
		this.acceptState = acceptState;
		this.rejectState = rejectState;
		this.setTransition(new HashMap<Character, ArrayList<Transition>> ());
	}

	// Getters and Setters
	public String getStateID() {
		return stateID;
	}
	public boolean isAcceptState() {
		return acceptState;
	}
	public boolean isRejectState() {
		return rejectState;
	}
	public void setStateID(String stateID) {
		this.stateID = stateID;
	}
	public void setAcceptState(boolean acceptState) {
		this.acceptState = acceptState;
	}
	public void setRejectState(boolean rejectState) {
		this.rejectState = rejectState;
	}

	public Map<Character, ArrayList<Transition>> getTransition() {
		return transition;
	}

	public void setTransition(Map<Character, ArrayList<Transition>> transition) {
		this.transition = transition;
	}

}
// this line make it work