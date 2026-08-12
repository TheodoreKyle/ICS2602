import java.util.*;
public class Days_Before_Christmas_Choa {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int month;
        int day;
        System.out.print("Enter the month: ");
        month = in.nextInt();
        System.out.print("Enter the day: ");
        day = in.nextInt();
        switch (month) {
            case 1:
                System.out.println(31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 2:
                System.out.println(29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 3:
                System.out.println(31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 4:
                System.out.println(30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 5:
                System.out.println(31 + 30 + 31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 6:
                System.out.println(30 + 31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 7:
                System.out.println(31 + 31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 8:
                System.out.println(31 + 30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 9:
                System.out.println(30 + 31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 10:
                System.out.println(31 + 30 + 25 - day + " days left before Christmas");
                break;
            case 11:
                System.out.println(30 + 25 - day + " days left before Christmas");
                break;
            case 12:
                if (day < 25)
                System.out.println(25 - day + " days left before Christmas");
                else if (day == 25)
                System.out.println("Today is Christmas!");
                else if (day >= 26 && day <= 31)
                System.out.println(day - 25 + " days after Christmas");
                else
                System.out.println("Invalid number of days.");
            break;
            default:
                System.out.println("Invalid month.");
        }
        in.close(); 
    }
}