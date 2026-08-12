public class November_7_2024 {
    public static void main (String[] args) {
        int i, j, a, b; 
        System.out.println("Write a program that prints 5 lines of asterisks, each line with 5 asterisks."); 
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        } // Asterisks
        System.out.println(); 
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(j); 
            }
            System.out.println();
        } // Prints 12345 per row
        System.out.println(); 
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(i); 
            }
            System.out.println();
        } // Prints 11111 then increments per row
        System.out.println(); 
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i); 
            }
            System.out.println();
        } // Number tree increment per row
        System.out.println(); 
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i); 
            }
            System.out.println();
        } // Number tree decrement per row
        System.out.println("\nMultiplication Table 10x10");
        System.out.println();
        for (a = 1; a <= 10; a++) {
            b = 1;
            while (b <= 10) {
                System.out.print(a * b + "\t");
                b++; 
            }
            System.out.println(); 
        }
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) 
            System.out.print(a * b + "\t");
            System.out.println();
        }
    }
}