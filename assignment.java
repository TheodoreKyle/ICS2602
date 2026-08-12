import java.util.*;
import java.io.*; 
public class assignment {
    public static void main(String[] args) {
        HashMap<String, String> userLogin = new HashMap<>();
        Scanner input = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            String txt_username = ""; 
            int LineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (LineNumber % 2 != 0) { 
                    txt_username = line;
                } 
                else { 
                    if (txt_username != null) {
                        userLogin.put(txt_username, line); 
                        txt_username = null;
                    }
                }
                LineNumber++;
            }
        } 
        catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.print("Enter username: ");
        String username = input.nextLine(); 
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (userLogin.containsKey(username) && userLogin.get(username).equals(password)) { 
            System.out.println("Access Granted\n");
            System.out.printf("%-18s | %-16s%n", "Username", "Password");
            for (Map.Entry<String, String> entry : userLogin.entrySet())
                System.out.printf("%-18s | %-16s%n", entry.getKey(), entry.getValue());
        }
        else 
            System.out.println("Access Denied");
    }
}