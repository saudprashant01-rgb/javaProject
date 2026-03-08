import java.util.ArrayList;

public class textt {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements to the ArrayList
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Apple");
        
        System.out.println("Fruits before clear: " + fruits); // Output: Fruits before clear: [Cherry, Banana, Apple]
        System.out.println("Size before clear: " + fruits.size()); // Output: Size before clear: 3

        // Clearing the ArrayList
        fruits.clear();

        System.out.println("Fruits after clear: " + fruits); // Output: Fruits after clear: []
        System.out.println("Size after clear: " + fruits.size()); // Output: Size after clear: 0
    }
}
