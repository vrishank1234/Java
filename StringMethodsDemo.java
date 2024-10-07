public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Length of string: " + str.length());
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Contains 'World': " + str.contains("World"));
    }
}
