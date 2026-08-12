import static java.lang.System.out;
public class prelimReviewer {
    public static void main (String[] args) {
        int a = 3;
        int b = a += 5;
        int c = 0x3ABE6; // Hexadecimal to Decimal
        int d = 0B0011_0011_01; // Binary to Decimal
        int a_very_very_very_very_very_long_var_name = 0_0_7;
        int $$$ = 0xABCD;
        byte ____ = 01;
        out.println("\"Ust's Finest Coders\""); // Output " "
        out.println("\"Ust\'s Finest Coders\""); // Output " " and '
        out.println(a + ", " + b); 
        out.println(c);
        out.println(d);
        out.println(a_very_very_very_very_very_long_var_name);
        out.println($$$);
        System.out.println(____);

        char ch = '*';
        int num = 50;
        char e = 64; // Output @ from ASCII values
        double pay = 35.75; 
        int r = 0b0111_1011;
        char rr = 'b';
        int z = 5;
        System.out.println(ch);
        System.out.println(pay = num * pay);
        System.out.println(e);
        System.out.println(r); 
        System.out.println(rr + 3); // 98 + 3
        System.out.println(z++);
        System.out.println(z);
        int aa = 10, bb = 11, cc = 12;
        System.out.println(aa < bb ? aa : bb < cc ? bb : cc);
        int AA = 81;
        System.out.println("Bitwise Operator: " + (AA << 2));
        int zz = 10; 
        out.println(zz++ + ++zz);
    }
}