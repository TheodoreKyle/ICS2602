public class Multi {
	public static void main (String args[]) {
		int row = Integer.parseInt(args[0]); 
		int column = Integer.parseInt(args[1]);
		int [][] mtable = new int[row][column];
		System.out.println("Multiplication Table"); 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				mtable[i][j] = (i + 1) * (j + 1); 	
			}
		}
		for (int[] itb : mtable) {
			for (int product : itb)
				System.out.print(product + "   "); 
			System.out.println(); 
		}
	}
}