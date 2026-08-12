import java.util.*;
class Days_of_Month {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int month;
        System.out.print("Enter number of month: ");
        month = in.nextInt();
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("No. of days = 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("No. of days = 31");
                break;
            case 2:
                System.out.println("No. of days = 28");
                break;
            default:
                System.out.println("Invalid number of month");        
        }
        in.close(); 
    }
} 