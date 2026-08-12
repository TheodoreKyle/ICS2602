import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, won't be added

        System.out.println("Colors: " + colors); // Unordered and unique
        System.out.println("Contains Green? " + colors.contains("Green"));
        System.out.println("Size: " + colors.size());

        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob"); // Duplicates are allowed

        System.out.println("Names: " + names);
        System.out.println("Second name: " + names.get(1)); // Bob
        names.remove(0); // Removes "Alice"
        System.out.println("After removal: " + names);

        List<String> fruits = new ArrayList<>();

        // add(E element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate is allowed
        System.out.println("Fruits: " + fruits);

        // add(int index, E element)
        fruits.add(1, "Orange");
        System.out.println("After inserting Orange at index 1: " + fruits);

        // get(int index)
        String fruitAtIndex2 = fruits.get(2);
        System.out.println("Fruit at index 2: " + fruitAtIndex2);

        // set(int index, E element)
        fruits.set(3, "Grapes"); // Replaces the element at index 3
        System.out.println("After setting index 3 to Grapes: " + fruits);

        // remove(int index)
        fruits.remove(0); // Removes the element at index 0
        System.out.println("After removing element at index 0: " + fruits);

        // indexOf(Object o)
        int firstIndexOfBanana = fruits.indexOf("Banana");
        System.out.println("First index of Banana: " + firstIndexOfBanana);

        // lastIndexOf(Object o)
        int lastIndexOfBanana = fruits.lastIndexOf("Banana");
        System.out.println("Last index of Banana: " + lastIndexOfBanana);

        // subList(int fromIndex, int toIndex)
        List<String> subList = fruits.subList(1, 3); // from index 1 to 2 (3 is exclusive)
        System.out.println("Sublist from index 1 to 2: " + subList);

        // size()
        System.out.println("Total fruits: " + fruits.size());

        // isEmpty()
        System.out.println("Is the list empty? " + fruits.isEmpty());

        // contains(Object o)
        System.out.println("Does the list contain Mango? " + fruits.contains("Mango"));

        // clear()
        fruits.clear();
        System.out.println("After clearing, is list empty? " + fruits.isEmpty());
    }
}