import java.io.*;
public class FileInputStreamEx4{
    public static void main(String [] args){
        try(FileInputStream fin=new FileInputStream(("Module_3/IOFile/File1.txt"));){
            int b;
            while((b=fin.read())!= -1 ){
                System.out.println(b);
            }catch(FileNotFoundException e){
                System.out.println("File Not Found Exception");
            }catch(IOException e){
                System.out.println("IO Error");
            }
        }
    }
}