import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        System.out.println("Set after adding elements: " + set);

        // Getting number of elements
        System.out.println("Number of elements in set: " + set.size());

        // Iterating through elements
        System.out.println("Iterating through set:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Removing an element
        set.remove("Apple");
        System.out.println("Set after removing 'Apple': " + set);
    }
}
