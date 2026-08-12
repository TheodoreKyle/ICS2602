import java.util.*;
public class Asynchronous_October_18_2024 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner kbd = new Scanner(System.in);
        int conversion, i, a, b, sum, ctr2;
        double increment, Celsius, Fahrenheit;
        i = 0; 
        sum = 0;
        ctr2 = 0;
        System.out.print("1. Input Celsius value: ");
        Celsius = input.nextDouble(); 
        System.out.print("How many conversions to be made? ");
        conversion = input.nextInt(); 
        System.out.print("Input increment between Celsius values: ");
        increment = input.nextDouble(); 
        System.out.println("\nCelsius to Fahrenheit Conversion");
        System.out.println("\nCelsius \tFahrenheit"); //Formatting
        while (i <= conversion){
            Fahrenheit = Celsius * 1.8 + 32;
            System.out.printf("%.2f\u00B0C\t\t%.2f\u00B0F\n", Celsius, Fahrenheit); //\t for Fahrenheit, \u00B0 unicode for degree
            Celsius += increment; 
            i++;
        }
        System.out.print("\n2. Enter value of a and b: ");
        a = kbd.nextInt();
        b = kbd.nextInt();
        ++a;
        --b; //Exclusive numbers between a and b
        while (a <= b) {
            if (a % 2 == 1){
                sum += a;
                ctr2++; 
            } 
            a++;
        }
        System.out.println("The sum of all odd numbers between a and b exclusive is: " + sum);
        System.out.println("The average of all odd numbers between a and b exclusive is: " + sum * 1.0 / ctr2);
        input.close();
        kbd.close(); 
    }
}