
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        //create a linked list 

        LinkedList <String> l1 = new LinkedList<String>();

        //Add elements in the linked list

        l1.add("F");
        l1.add("D");
        l1.add("B");
        l1.add("C");
        l1.add("E");

        l1.addLast("Z");

        l1.addFirst("A");

        l1.add("A2");

        System.out.println("Original contents of l1: "+l1);

        //remove elements from the linked list

        l1.remove("F");

        l1.remove(2);

        System.out.println("Contents of the l1 after deletion: "+ l1);

        //Remove first and last elements 

        l1.removeFirst();
        l1.removeLast();

        System.out.println("l1 after deleting first and last element: "+l1);

        //Get and set a value 

        String val = l1.get(2);
        l1.set(2, val);

        System.out.println("l1 after change: "+l1);




        


    }
}