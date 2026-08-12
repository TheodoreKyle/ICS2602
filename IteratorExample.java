import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
            if (name.equals("Bob")) {
                it.remove(); // Remove "Bob"
            }
        }

        System.out.println("After iteration: " + names);
    }
}