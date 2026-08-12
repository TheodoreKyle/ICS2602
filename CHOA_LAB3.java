import java.util.*;
public class CHOA_LAB3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String school1 = "University of Santo Tomas";
        String school2 = "university of santo tomas";
        String message = "          I love";
        String test;
        System.out.println(school1);
        System.out.println(school2);
        System.out.println(message);
        System.out.println(school1.charAt(0));
        System.out.println(school1.length());
        System.out.println(school1.equals(school2));
        System.out.println(school1.equalsIgnoreCase(school2));
        System.out.println(message.concat(school1));
        System.out.print("Type any text to compare with school1: ");
        test = input.nextLine();
        System.out.println(test.equals(school1));
        System.out.println(school2.toUpperCase());
        System.out.println(school1.toUpperCase());
        System.out.println(school2.substring(school2.length()-1));
        System.out.println(message.charAt(0));
        System.out.println(school2.length());
        System.out.println(school2.replace('i', '!'));
        System.out.println(school1.substring(14));
        System.out.println(message.trim());
        System.out.println(message.length());
        System.out.println(school1.compareTo(school2));
        System.out.println(message.substring(12, 16));
        input.close(); 
    }
}