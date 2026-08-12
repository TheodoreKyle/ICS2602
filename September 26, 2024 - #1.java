import java.util.*;
class Area_and_Perimeter_of_Triangle {    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, base, height;       
        char AP;        
        System.out.println("Solve for the Area or Perimeter of the triangle? Type A for Area or P for Perimeter: ");
        AP = in.next().charAt(0);
        switch (AP) {
            case 'a':
            case 'A':
                System.out.println("Enter the base and height: ");
                base = in.nextDouble();
                height = in.nextDouble();
                System.out.println("The area is: " + (base * height) / 2);
                break;
            case 'p':
            case 'P':
                System.out.println("Enter the three sides: ");
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                System.out.println("The perimeter is: " + (a + b + c));
                break;
            default:
                System.out.println("Invalid choice ");
        }
        in.close(); 
    }
}