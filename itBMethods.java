public class itBMethods {
    
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating an object.");
        System.out.println("-----------------------------------------------------"); 
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating an object."); 
    }

    public void asd(int a){
        System.out.println("Method with single parameter: " + a); 
    }

    public int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int square(int num) {
        return num * num; 
    }

    public static void main (String[] args) {
        myStaticMethod();
        itBMethods ITB = new itBMethods(); 
        ITB.myPublicMethod();

        int num1 = 25, num2 = 15; 
        int add = ITB.addNumbers(num1, num2);

        int sq = square(10); 
        System.out.println("Squared value of 10 is: " + sq); 

        System.out.println("Sum is: " + add); 

        ITB.asd(55);
        myStaticMethod();
        myStaticMethod();
        myStaticMethod();
        greet(); 

        System.out.println("Sqaure root of 4 is: " + Math.sqrt(4)); 
    }
    static void greet() {
        System.out.println("Good morning IT"); 
    }
}