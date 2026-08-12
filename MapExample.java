import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map using HashMap
        Map<String, Integer> ageMap = new HashMap<>();

        // put(K key, V value)
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        System.out.println("Initial Map: " + ageMap);

        // get(Object key)
        System.out.println("Alice's age: " + ageMap.get("Alice"));

        // remove(Object key)
        ageMap.remove("Bob");
        System.out.println("After removing Bob: " + ageMap);

        // containsKey(Object key)
        System.out.println("Contains Charlie? " + ageMap.containsKey("Charlie"));

        // containsValue(Object value)
        System.out.println("Contains age 25? " + ageMap.containsValue(25));

        // keySet()
        System.out.println("Keys: " + ageMap.keySet());

        // values()
        System.out.println("Values: " + ageMap.values());

        // entrySet()
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // size()
        System.out.println("Size: " + ageMap.size());

        // clear()
        ageMap.clear();
        System.out.println("After clear, is map empty? " + ageMap.isEmpty());
    }
}