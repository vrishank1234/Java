import java.io.File;

public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("example.txt");

        System.out.println("File exists: " + file.exists());
        System.out.println("File path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
    }
}
