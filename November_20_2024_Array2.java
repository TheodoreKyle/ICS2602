import java.util.*;  
@SuppressWarnings({"unused", "resource"}) 
public class November_20_2024_Array2 {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in); 
        int arraySize, enter; 
        System.out.print("Enter the size of the array: "); 
        arraySize = console.nextInt();
        System.out.println(); 
        int[] list = new int[arraySize];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter a value: ");
            list[i] = console.nextInt(); 
        }
        System.out.print("What index to be printed? "); 
        int index = console.nextInt(); 
        System.out.println(list[index]); 
    } 
}