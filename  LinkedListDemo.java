import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");

        // Remove last element
        list.removeLast();
        System.out.println("List after removing last element: " + list);

        // Retrieve last element without removing
        System.out.println("Last element: " + list.getLast());

        // Print all elements
        System.out.println("All elements: " + list);

        // Remove all elements
        list.clear();
        System.out.println("List after clearing all elements: " + list);
    }
}
