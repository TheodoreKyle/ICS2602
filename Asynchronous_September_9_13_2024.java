public class Asynchronous_September_9_13_2024 {
    public static void main (String[] args){
        int a = 2, b = 5, c = 14;
        int A = 4, B = 2, C = 5;
        int aa = 5, bb = 2, cc = 10;
        double result1 = Math.pow(c, b) + c * Math.pow(b, c) * b;
        boolean result2 = (cc + aa) * bb < cc * bb + 2;
        c = a++ + b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println("Part IV");
        System.out.println(25 / 2);
        System.out.println((float)(25) / 2);
        System.out.println((float)(25 / 2));
        System.out.println((double)(25 % 2) + 25 / 2);
        System.out.println(25.0 / 2);
        System.out.println(25.0 % 2);
        System.out.println((int)((15.0 / 2)+ 2));
        System.out.println(20 / (double)(4 + 2));
        System.out.println((double)(20 / 4 + 2));
        System.out.println(20 % 4 + 2);
        System.out.println();
        System.out.println("Part V");
        System.out.println((A + B * C + B) - ((Math.pow(C, 2)) - C * A + C));
        System.out.println((int)(A * 0.5 + C) - (Math.pow(A + B, B)) + (A + C) * B + --A);
        System.out.println((A + B) * C - A / (C - B) + A * B / ++A - Math.pow(A + C, B));
        System.out.println(((C * C) / B - Math.pow(A, B)) / B + A + C * B);
        System.out.println((C - B * A) + B - C * A / B);
        System.out.println();
        System.out.println("Part 6");
        System.out.println(!(aa + bb > cc) || aa == cc && aa > cc - bb);
        System.out.println(aa - 2 != aa * bb && cc < aa + 5);
        System.out.println((aa - b) * c > aa - b * c && aa > b || c - aa > b);
        System.out.println((cc * bb + aa) > Math.pow(aa, bb) || aa + bb * cc == cc * bb && aa > bb);
        System.out.println(result1 > 0 && result2); 
    }
}