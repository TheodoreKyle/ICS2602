import java.util.*;
@SuppressWarnings("resource") 
public class Test2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, MAX = -999, MIN = Integer.MAX_VALUE, HCode = 0, LCode = 0;
        int[][] Record = new int[20][4];
        for (a = 0; a < 20; a++) { 
            System.out.print("Enter Product Code: ");
            Record[a][2] = input.nextInt(); 
            System.out.print("Enter Quantity: ");
            Record[a][2] = input.nextInt();
            System.out.print("Enter Unit Price: ");
            Record[a][2] = input.nextInt();
            Record[a][3] = Record[a][1] * Record[a][2];
            System.out.println(); 
        }
        for (a = 0; a < 20; a++) {
            if (Record[a][3] > MAX) {
                MAX = Record[a][3]; 
                HCode = Record[a][0];
            }
            if (Record[a][3] < MIN) { 
                MIN = Record[a][3];
                LCode = Record[a][0]; 
            }
        } 
        System.out.println("\nProduct Code\tQuantity\tUnit Price\tAmount"); 
        for (a = 0; a < 20; a++)
        System.out.println(Record[a][0] + "\t\t" + Record[a][1] + "\t\t" + Record[a][2] + "\t\t" + Record[a][3]);
        System.out.println("\nProduct code " + HCode + " is the best seller with sale amount " +  MAX + "."); 
        System.out.println("Product code " + LCode + " is the worst seller with sale amount " +  MIN + ".");
    }
}