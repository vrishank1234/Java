import java.util.*;
public class animals1 {

    public static void main(String[] args) {
        //List l1 store String Objects
        // Animals1<String> animals1 = new Animals1<String>();
        ArrayList<String> animals1 = new ArrayList<String>();

        animals1.add("Cat");
        animals1.add("Dog");
        animals1.add("Cow");
        animals1.add("Lion");

        System.out.println("Print elements in the list the was added");
        System.out.println("animals1:"+animals1);


        animals1.add(0,"Tiger");
        System.out.println("animals1 added tiger:"+animals1);

        animals1.add(3,"Zebra");
        System.out.println("animals1 added tiger:"+animals1);

        ArrayList<String> animals2 = new ArrayList<String>();

        animals2.add("Kangaroo");
        animals2.add("Donkey");
        animals2.add("Cow");
        System.out.println("List2 is :"+animals2);

        animals1.addAll(animals2);
        System.out.println("The added version is"+animals1);

        System.out.println(animals1.indexOf("Cow"));
        System.out.println(animals1.lastIndexOf("Cow"));
        System.out.println(animals1.contains("Dog"));
        System.out.println(animals1.contains("Rat"));
        System.out.println(animals1.isEmpty());
        System.out.println(animals1.size());
        System.out.println(animals1.remove("Cow"));
        System.out.println(animals1);
        System.out.println(animals1.remove(2));
        System.out.println(animals1);
        animals1.add(2,"Ant");
        System.out.println(animals1);
        animals1.set(2,"Antelope");
        System.out.println(animals1);


        for(int i=0; i<animals1.size();i++){
            System.out.println(animals1.get(i));
        }
        System.out.println("Using For Loop");

        for(String str: animals1){
            System.out.println(str);
        }
        System.out.println("Using For each Loop");
        System.out.println("***Iterating with iterator***");
        Iterator <String> itr = animals1.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        ListIterator <String> listItr = animals1.listIterator();
        System.out.println("====Forward====");
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }

        System.out.println("===Backward===");
        ListIterator <String> listItr1 = animals1.listIterator(animals1.size());

        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }





    }
    }