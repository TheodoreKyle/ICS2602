import java.util.*;  
@SuppressWarnings("unused")
public class November_20_2024_Array1 {
    public static void main (String[] args) {
        int quiz[] = new int[5];
        System.out.println(quiz.length); 
        int orig[] = {1, 2, 3, 4, 5}; // index of 4 : length of 5
        int temp[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // index of 9 : length of 10
        System.out.println(orig[2]); 
        System.out.println(orig[0] + "\t" + orig[1] + "\t" + orig[2] + "\t" + orig[3] + "\t" + orig[4] + "\t"); 
        
        for (int i = 0; i < orig.length; i++)
        System.out.print(orig[i] + "\t");

        System.out.println(); 
        System.out.println("\nLoad into array A the first 10 integers. Print the array."); 
        int[] A = new int[10]; 
        for (int ii = 0; ii < A.length; ii++) {
            A[ii] = ii; 
            System.out.print(A[ii] + "   "); 
        }
        System.out.println("\n"); 
        float[] B = new float[50]; 
        for (int iii = 0; iii < B.length; iii++) {
            B[iii] = iii; 
            System.out.print(B[iii] + "   "); 
        }
        System.out.println("\n"); 
        double[] C = new double[100]; 
        for (int iiii = 0; iiii < C.length; iiii++) {
            C[iiii] = iiii; 
            System.out.print(C[iiii] + "   "); 
        }
        System.out.println("\n"); 
        char[] D = new char[26]; 
        for (char iiiii = '\u0041'; iiiii < '\u0041' + D.length; iiiii++) {   
            D[iiiii - '\u0041'] = iiiii;  
            System.out.print(D[iiiii - '\u0041'] + "   "); 
        }
    } 
}