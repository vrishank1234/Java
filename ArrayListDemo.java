import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        System.out.println("List after adding elements: " + list);

        // Adding a collection of elements
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");
        list.addAll(moreFruits);
        System.out.println("List after adding collection: " + list);

        // Removing an element
        list.remove("Banana");
        System.out.println("List after removing 'Banana': " + list);

        // Checking if list is empty
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
