import java.util.LinkedList;


public class TapeTree {
	private static int currentDepth = 0;
	private static boolean accepted = false;
	
	private Tape tape;
	private LinkedList<TapeTree> tapeTree;
	private int depth;
	private boolean rejected;
	
	public TapeTree(Tape tape, int depth, boolean rejected) {
		super();
		this.tape = tape;
		this.depth = depth;
		this.setTapeTree(new LinkedList<TapeTree>() );
		this.setRejected(rejected);
	}

	public Tape getTape() {
		return tape;
	}

	public void setTape(Tape tape) {
		this.tape = tape;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public static int getCurrentDepth() {
		return currentDepth;
	}

	public static void setCurrentDepth(int currentDepth) {
		TapeTree.currentDepth = currentDepth;
	}

	public LinkedList<TapeTree> getTapeTree() {
		return tapeTree;
	}

	public void setTapeTree(LinkedList<TapeTree> tapeTree) {
		this.tapeTree = tapeTree;
	}

	public static boolean isAccepted() {
		return accepted;
	}

	public static void setAccepted(boolean accepted) {
		TapeTree.accepted = accepted;
	}

	public boolean isRejected() {
		return rejected;
	}

	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}

	public static void updateDepth(int newDepth) {
		if (currentDepth < newDepth) {
			setCurrentDepth(newDepth);
		}
	}
}
// this line make it work