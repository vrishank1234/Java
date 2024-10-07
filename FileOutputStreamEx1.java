import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileOutputStreamEx1{
    public static void main(String [] args){
        try(FileOutputStream fout=new FileOutputStream("Module_3/IOFile/File1.txt")){
            String s ="Welcome to Java Learners";
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("Write in File");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found Exc");
        }catch(IOException e){
            System.out.println("IO Error");
        }
    }
}