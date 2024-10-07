public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.replace(6, 12, "Java");
        System.out.println("After replace: " + sb);

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Length: " + sb.length());

        sb.reverse(); 
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);
    }
}
