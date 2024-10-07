public class StringObject {
    public static void main(String[] args) {
        String s1 = "Hello World";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");
        String s4 = "hello world";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1 of s1: " + s1.charAt(1));
        System.out.println("First index of 'l' : " + s1.indexOf("l"));
        System.out.println("Last index of 'l' : " + s1.lastIndexOf("l"));

        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equals s4: " + s1.equals(s4));

        System.out.println("s1 equals s4 (ignore case): " + s1.equalsIgnoreCase(s4));

        System.out.println("Comparing s1 with s3: " + s1.compareTo(s3));
        System.out.println("Comparing s1 with s4: " + s1.compareTo(s4));
        System.out.println("Comparing s1 with 'Hello World': " + s1.compareTo("Hello World"));

        System.out.println("Substring of s1 from index 6: " + s1.substring(6));
        System.out.println("s1 in uppercase: " + s1.toUpperCase());
        System.out.println("s1 in lowercase: " + s1.toLowerCase());
        System.out.println("Index of 'o' in s1: " + s1.indexOf('o'));

        String s5 = s1.concat(" - Welcome!");
        System.out.println("Concatenated string: " + s5);

        System.out.println("Replacing 'o' with 'X' in s1: " + s1.replace('o', 'X'));
        System.out.println("Does s1 start with 'Hello'? " + s1.startsWith("Hello"));
        System.out.println("Does s1 end with 'World'? " + s1.endsWith("World"));

        String result = String.join(" ", "Alpha" , "Beta" , "Gamma");
        System.out.println(result);

        result = String.join(" ", "John" , "ID#: 569", "E-mail: John@HerbSchidt.com");
        System.out.println(result);

        String str = "Welcome to Java World";
        int count = 0;
        for(int i = 0 ; i<=str.length()-1;i++){
            if(str.charAt(i)=='o'){
                count++;
            }
        }
        System.out.println("Frequency of t is =count");
    }
}