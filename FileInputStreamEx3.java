import java.io.*;
public class FileInputStreamEx3{
    public static void main(String [] args){
        FileInputStream fin = null;
        try{
            fin=new FileInputStream(("Module_3/IOFile/File.txt"));
            int b;
            while((b = fin.read())!=-1){
                System.out.println((Char)b);
            }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found Exception");
        }catch(IOException e){
            System.out.println("IO Error");
        }finally{
            try{
                if (fin!=null)
                fin.close();
            }catch(IOException e){
                System.out.println("Error Closing File");
            }
        }
    }
}