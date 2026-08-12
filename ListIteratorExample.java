import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Chennai"));

        ListIterator<String> listIt = cities.listIterator();

        // Forward traversal
        while (listIt.hasNext()) {
            String city = listIt.next();
            System.out.println("Forward: " + city);
            if (city.equals("Mumbai")) {
                listIt.set("Pune"); // Replaces "Mumbai" with "Pune"
            }
        }

        // Backward traversal
        while (listIt.hasPrevious()) {
            System.out.println("Backward: " + listIt.previous());
        }

        System.out.println("Modified list: " + cities);
    }
}
