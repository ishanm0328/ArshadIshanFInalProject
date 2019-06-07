public class Runner_PerfectSquare {
	public static void main (String [] args) {
		Perfect_Square perf = (int x) -> { if (Math.pow((Math.sqrt(x)),2) == x) return false; else return true;};
		System.out.println(perf.square(25));
	}
}