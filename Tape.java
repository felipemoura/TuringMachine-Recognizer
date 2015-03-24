public class Tape {
	private int currenPosition;
	private String tape;
	private State currentState;
	
	public Tape (String tape, int position) {
		this.setTape(tape);
		this.setCurrenPosition(position);
	}
	
	public String getTape() {
		return tape;
	}

	public void setTape(String tape) {
		this.tape = tape;
	}

	public int getCurrenPosition() {
		return currenPosition;
	}

	public void setCurrenPosition(int currenPosition) {
		this.currenPosition = currenPosition;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}
// This line make it work