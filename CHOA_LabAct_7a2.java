import java.util.*;
@SuppressWarnings("resource")
public class CHOA_LabAct_7a2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, n, i, sum;
        sum = 0;
        System.out.print("Enter x: ");
        x = in.nextInt();
        System.out.print("Enter n: ");
        n = in.nextInt();
        for (i = 1; i <= n; i++) 
            sum += Math.pow(x, i); 
        System.out.print("Sum of " + x + "^1 to " + x + "^" + n + " is: " + sum);
	}
}