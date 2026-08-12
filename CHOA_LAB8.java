import java.util.*; 
public class CHOA_LAB8 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, MAX, MIN, HCode = 0, LCode = 0;
        int[][] Record = new int[20][4];
        System.out.print("Enter Product Code, Quantity, and Unit Price: "); 
        for (a = 0; a < 20; a++) { 
            for (b = 0; b < 3; b++) 
            Record[a][b] = input.nextInt(); 
            Record[a][3] = Record[a][1] * Record[a][2];
        }
        MAX = Record[0][3];
        MIN = Record[0][3];
        HCode = Record[0][0];
        LCode = Record[0][0];
        for (a = 1; a < 20; a++) {
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