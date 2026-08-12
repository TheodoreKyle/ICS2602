import java.util.*; 
public class November_21_2024_Seatwork_2DimensionalArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sum, newSum, ctr, tmp, i, j; 
        int[][] x = new int[3][3];
        System.out.println("Input 9 elements into square array x. Print the sum and average of each row."); 

        for (i = 0, ctr = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
            x[i][j] = input.nextInt();
            ctr++;
        }

        for (i = 0; i < 3; i++) {
            sum = 0; 
            for (j = 0; j < 3; j++) {
                sum += x[i][j];
                System.out.print(x[i][j] + "\t"); 
            }
            System.out.print(sum + "\t" + sum * 1.0 / ctr + "\n"); 
        }

        System.out.println();
        System.out.println("Interchange the elements of the main diagonal and secondary diagonal.");
        tmp = x[0][0];
        x[0][0] = x[2][2];
        x[2][2] = tmp;

        tmp = x[0][2];
        x[0][2] = x[2][0];
        x[2][0] = tmp;

        for (i = 0; i < 3; i++) {
            newSum = 0;
            for (j = 0; j < 3; j++) {
                newSum += x[i][j]; 
                System.out.print(x[i][j] + "\t");
            }
            System.out.print(newSum + "\t" + newSum * 1.0 / ctr + "\n"); 
        }
    }
}