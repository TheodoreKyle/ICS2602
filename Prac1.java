public class Prac1 {
	public static void main (String args[]) {
		int[] quiz = new int[args.length]; 
		int a; 
		double sum = 0; 
		for (a = 0; a < args.length; a++) {
			quiz[a] = Integer.parseInt(args[a]);
			sum += quiz[a];
		}
		System.out.println("Sum of quiz: " + sum); 
		System.out.println("Average of quiz: " + (sum / args.length)); 
		double average = sum / args.length; 
		System.out.println("Another average: " + average);  
	}
} 