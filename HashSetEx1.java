import java.util.*;
public class HashSetEx1{
    public static void main (String[] args){
        HashSet<String> h = new HashSet<String>();
        h.add("BB");
        h.add("AA");
        h.add("DD");
        h.add("CC");

        System.out.println(h.add("BB"));
        System.out.println(h);
        System.out.println("List contains DD or not:"+ h.contains("DD"));
        h.remove("AA");
        System.out.println("List after removing AA:"+ h);
        System.out.println("Iterating over list");

        Iterator<String> itr=h.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());

        System.out.println();

        System.out.println("Using enhanced for loop");
        for(String element : h){
            System.out.println(element+",");
        }
    }
}