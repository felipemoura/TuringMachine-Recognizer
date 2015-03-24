import java.util.HashMap;
import java.util.Map;


public class TuringMachine {
	private Map<String, State> turingMachine;
	
	public TuringMachine () {
		this.setTuringMachine(new HashMap<String, State> ());
	}

	public Map<String, State> getTuringMachine() {
		return turingMachine;
	}

	public void setTuringMachine(Map<String, State> turingMachine) {
		this.turingMachine = turingMachine;
	}
}
// this line make it work