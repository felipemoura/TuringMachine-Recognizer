public class Transition {
	private char input;
	private char replace;
	private char move;
	
	private String nextState;

	public Transition(char input, char replace, char move, String nextState) {
		super();
		this.input = input;
		this.replace = replace;
		this.move = move;
		this.nextState = nextState;
	}

	public char getInput() {
		return input;
	}

	public char getReplace() {
		return replace;
	}

	public char getMove() {
		return move;
	}

	public String getNextState() {
		return nextState;
	}

	public void setInput(char input) {
		this.input = input;
	}

	public void setReplace(char replace) {
		this.replace = replace;
	}

	public void setMove(char move) {
		this.move = move;
	}

	public void setNextState(String nextState) {
		this.nextState = nextState;
	}
}
// This line make it work