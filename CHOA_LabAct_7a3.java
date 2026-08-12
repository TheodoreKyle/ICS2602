import java.util.*;
@SuppressWarnings("resource")
public class CHOA_LabAct_7a3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        float x;
        int n = 0;
        double sum = 0, ss = 0; 
        System.out.print("Enter 10 floating values: ");
        while (n < 10) {
            x = in.nextFloat();  
            sum += x; 
            ss += x * x; 
            n++;
        }
        System.out.println("Average is: " + sum / n);    
        System.out.println("Standard Deviation is: " + Math.sqrt((ss - (sum * sum / n)) / (n - 1)));
    }
}