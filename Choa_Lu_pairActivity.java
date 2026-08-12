import java.util.*; 
@SuppressWarnings("resource") 
public class Choa_Lu_pairActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName;
		String str1 = "Hello, 1ITA!"; 
		String str2 = "Java Programming is Fun"; 
		String str3 = " Trim me "; 
		String str4 = "HELLO, 1ITA!";

		System.out.print("Enter your first name: ");
		firstName = input.nextLine(); 
		System.out.print("Enter your last name: ");
		lastName = input.nextLine(); 
		
		String fullName = firstName.concat(" " + lastName);
		System.out.println("2. Your full name is: " + fullName); 
		System.out.println("3. Length of your full name is: " + fullName.length()); 
		System.out.println("4. Your name in uppercase is: " + fullName.toUpperCase()); 
		
		String fullNameLower = fullName.toLowerCase(); 
		if (fullNameLower.contains("a")) 
			System.out.println("5. There is an 'a' in your name.");
		else
			System.out.println("5. There is no 'a' in your name."); 
		
		System.out.println("6. First 3 characters of your full name is: " + fullName.substring(0, 3)); 
		System.out.println("8. Length of string str1 is: " + str1.length());
		System.out.println("9. Character at index 5 of string str1 is: " + str1.charAt(5));
		
		if (str1.equals(str4))
			System.out.println("10. str1 and str2 is equal.");
		else
			System.out.println("10. str1 and str2 is not equal.");	
		
		System.out.println("11. " + str1.compareToIgnoreCase(str4));
		System.out.println("12. " + str2.substring(5)); 
		System.out.println("13. " + str2.substring(5, 11));
		System.out.println("14. " + str1.replace('o', 'a')); 
		System.out.println("15. " + str3.trim()); 
		System.out.println("16. " + str1.toLowerCase() + " & " + str1.toUpperCase()); 
		System.out.println("17. " + str2.indexOf("Java")); 
		
		String[] array = str1.split(", ");
		System.out.print("19. ");
		for (String part : array)
			System.out.println(part); 
		
		String[] words = {"Hello", "Java"};
		String sentence = String.join(" ", words);
		System.out.println("20. " + sentence); 
	}
}