public class TestFinally2 {
	public static void main(String args[]) {
		System.out.println("Enter the for loop..");
		for (int i = 1; i <= 5; i++) {
			try {
                if (i == 2)
                    break;
				System.out.println("i = " + i);
			}	
			catch (Exception e) {
				System.out.println("inside catch block..");
			}
			finally {
				System.out.println("inside the finally block..");
			}
		}
		System.out.println("after the loop..");
	}
}