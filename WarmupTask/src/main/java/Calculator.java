public class Calculator {
	private long state = 0;
	private int turnOnCalculator = 0;

	public Calculator() {
		this.setTurnOnCalculator(1);
	}

	public void add(long val) {
		state += val;
	}

	public long getState() {
		return state;
	}

	public void set(long val) {
		state = val;
	}

	public void multiplyBy(long val) {
		state *= val;
	}

	public void power(long val) {
		state = new Double(Math.pow(state, val)).longValue();
	}

	public int getTurnOnCalculator() {
		return turnOnCalculator;
	}

	public void setTurnOnCalculator(int turnOnCalculator) {
		this.turnOnCalculator = turnOnCalculator;
	}
}
