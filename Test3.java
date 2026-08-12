import java.util.*;
@SuppressWarnings("resource") 
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i; 
        String[] A = new String[5];
        System.out.print("Enter some words: "); 
        for (i = 0; i < 5; i++) {
            A[i] = input.nextLine(); 
            if (i < 4) {
                System.out.print("Enter few more words: "); 
            }
        } 
        System.out.println();        
        for (i = 0; i < 5; i++)
        System.out.println(A[i]); 
    }
}