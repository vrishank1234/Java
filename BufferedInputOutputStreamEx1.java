import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferedInputOutputStreamEx1 {
    public static void main(String[] args) {
        try (BufferedInputStream fin = new BufferedInputStream(new FileInputStream("/Users/tanaysahajwalla/Desktop/dir2/subdir1"));
             BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("/Users/tanaysahajwalla/Desktop/dir2/subdir1"))) {

            byte[] buffer = new byte[1024];
            int lenRead;

            while ((lenRead = fin.read(buffer)) > 0) {
                fout.write(buffer, 0, lenRead);
                fout.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("Error in file handling");
        }
    }
}