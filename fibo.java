import java.util.*; 
public class fibo {
	public static void main(String[] args) {
		String name;
		int age, ch;
		char citizenship; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main Menu");
		System.out.println(" [1] Age Classification");
		System.out.println(" [2] Citizenship Classification");
		System.out.println("Choice [1/2]: "); 
		ch = sc.nextInt();  
        sc.nextLine(); 
		
		switch (ch) {
		case 1: {
			System.out.print("Input a name: ");
			name = sc.nextLine(); 
			System.out.print("Input age: "); 
			age = sc.nextInt(); 
			if (age < 13) {
				System.out.println(" " + name + " you are " + age + " and classified as kids");
			}
			else if (age <= 19) {
				System.out.println(" " + name + " you are " + age + " and classified as teens");
			}
			else if (age <= 59) {
				System.out.println(" " + name + " you are " + age + " and classified as adult");
			}
			else {
				System.out.println(" " + name + " you are " + age + " and classified as senior");
			}
			break; 
		}
		
		case 2: {
			System.out.println("Input initials of your citizenship: ");
			citizenship = sc.next().charAt(0);  
			if (citizenship == 'A' || citizenship == 'a') {
				System.out.println("You are American");
			}
			else if (citizenship == 'I' || citizenship == 'i') {
				System.out.println("You are Italian");
			}
			else if (citizenship == 'J' || citizenship == 'j') {
				System.out.println("You are Japanese");
			}
			else if (citizenship == 'F' || citizenship == 'f') {
				System.out.println("You are Filipino");
			}
			else {
				System.out.println("Not in the choices"); 
			}
			break;
		}
		
		default: {
			System.out.println("Not on the list"); 
		}
		}
	}
}