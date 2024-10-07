package FileHandling;
import java.io.File;
import java.io.IOException;
public class Filedemo {
    public static void main(String[] args) throws IOException{
        // File f1 = new File("/Users/manmeetsingh/Desktop/java/FileHandling/MyFile.txt");
        // File f1 = new File("FileHandling/MyFile.txt");
        File f1 = new File("FileHandling");
        // File f1 = new File("/Users/manmeetsingh/Desktop/java/FileHandling/MyFile2.txt");
        if(f1.exists())
        {
            System.out.println("File Name: "+ f1.getName());
            System.out.println("Path: "+ f1.getPath());
            System.out.println("Abs Path: "+ f1.getAbsolutePath());
            System.out.println("Parent: "+ f1.getParent());
            System.out.println(f1.exists() ? "exists" : "does not exist");
            System.out.println("is" + ((f1.isDirectory() ? "" : "not")) + "a directory");
            System.out.println(f1.isFile() ? "is file" : "is not a file");
            System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute");
            System.out.println("File last modified: " + f1.lastModified());
            System.out.println("File size: "+ f1.length() + "Bytes");

            if(f1.isDirectory())
            {
                for(File subFile : f1.listFiles())
                {
                    System.out.println(" " + subFile);
                }
            }
            File obj = new File("/Users/manmeetsingh/Desktop/java/FileHandling/NewFile.txt");
            obj.createNewFile(); // throws IO Exception // return boolean

            File obj1 = new File("/Users/manmeetsingh/Desktop/java/FileHandling/NewMkdir");
            System.out.println(obj1.mkdir()); // return boolean 

            File obj2 = new File("/Users/manmeetsingh/Desktop/java/FileHandling/NewMkdir2/Sub");

            System.out.println(obj2.mkdirs());

            File obj3 = new File("/Users/manmeetsingh/Desktop/java/FileHandling/NewMkdir/Sub2");
            System.out.println(obj2.renameTo(obj3));

            File obj4 = new File("/Users/manmeetsingh/Desktop/java/FileHandling/NewFile2");
            System.out.println(obj.renameTo(obj4));



        }
    }
}