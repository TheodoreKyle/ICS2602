public class Seatwork_2_November_7_2024 {
    public static int AREA(int b, int h) {
        return b * h; 
    }
    public static double INERTIA(int b, int h) {
        return Math.pow(h, 3) * b / 12; 
    }
    public static double MODULUS(int b, int h) {
        return Math.pow(h, 2) * b / 6;
    }
    public static void main (String[] args) {
        int b, h; 
        System.out.println("Lumber Size\tCross-Sectional Area\tMoment of Inertria\tSection Modulus");  
        for (b = 2; b <= 10; b += 2) {
            for (h = 2; h <= 12; h += 2) {
                System.out.print(b + "x" + h + "\t"); 
                System.out.printf("\t%10d", AREA(b, h)); 
                System.out.printf("\t\t%10.2f", INERTIA(b, h)); 
                System.out.printf("\t\t%10.2f\n", MODULUS(b, h)); 
                System.out.println();
            }
        } 
    }
}