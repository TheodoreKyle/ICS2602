public class AssertTest {
	public static void main(String args[]) {
		int hour = Integer.parseInt(args[0]);
		int mins = Integer.parseInt(args[1]);
		
		assert(hour >= 0 && hour < 24) : "Illegal hour value";
		assert(mins >= 0 && mins < 60) : "Illegal mins value";
		
		System.out.println(hour + ":" + mins);
	}
}