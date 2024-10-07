import java.io.*;;
public class FileStreamAvailable {
    public static void main(String[] args) {
        try(FileInputStream s=new FileInputStream("checkFileInput/new.txt")) {
            System.out.println("available bytes: "+s.available());
            s.read();
            s.read();
            s.read();
            System.out.println("available bytes: "+s.available());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}