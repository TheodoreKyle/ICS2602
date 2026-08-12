import java.util.*;
@SuppressWarnings("resource") 
public class CHOA_THEODOREKYLE_LAB7b {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 4, SENTINEL2 = 0;  
        int a, int_value, grade, sum, ctr, ctr2, highest_grade;             
        System.out.print("Enter a value between 1 and 4: ");
        a = input.nextInt();
        int_value = a;
        while (a < SENTINEL) {
            System.out.print("\n1 Add 1\n2 Multiply by 2\n3 Subtract 4\n4 Quit: ");
            a = input.nextInt();
            switch (a) {
                case 1: 
                    int_value += 1;
                    System.out.println("\n" + int_value);
                    break;
                case 2:
                    int_value *= 2;
                    System.out.println("\n" + int_value);
                    break;
                case 3:
                    int_value -= 4;
                    System.out.println("\n" + int_value);
                    break; 
                default:
                    System.out.println("\nFinal value: " + int_value);
                }
            }
        System.out.print("Enter student's grade: "); 
        for (grade = 0, sum = 0, ctr = 0, ctr2 = 0, highest_grade = 0, grade = input.nextInt(); grade > SENTINEL2 && grade <= 9; grade = input.nextInt()) { 
            sum += grade;
            ctr++;
            highest_grade = Math.max(highest_grade, grade); 
            System.out.print("Enter student's grade: ");
            if (grade < 4)
            ctr2++; 
        }
        System.out.printf("Class average: %.2f%n", sum * 1.0 / ctr);
        System.out.println("Highest grade: " + highest_grade); 
        System.out.println("Number of students that failed the course: " + ctr2);
        if (ctr2 > 10)
        System.out.println("The teacher sucks!"); 
    }
}