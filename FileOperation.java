//create a file: File123.txt on desktop. Check properties of file through code. 
//create another file, File456.txt using 'create new' method, then create a directory dir1 using mkdir method
//create dir2/subdir1 in a single command using mkdir. Rename File456.txt to File654.txt
//under subdir1, create two files: File11.txt and File22.txt.
//Find all files and sub directories in Dir2 using ListFiles
//print length of File named File123.txt
import java.io.File;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        try {
            String desktopPath = System.getProperty("user.home") + "/Desktop";
            File file123 = new File(desktopPath + "/File123.txt");
            if (file123.createNewFile()) {
                System.out.println("File123.txt created on Desktop.");
            } else {
                System.out.println("File123.txt already exists.");
            }
            System.out.println("File123.txt Properties:");
            System.out.println("Absolute Path: " + file123.getAbsolutePath());
            System.out.println("Writable: " + file123.canWrite());
            System.out.println("Readable: " + file123.canRead());
            System.out.println("File Size: " + file123.length() + " bytes");

            File file456 = new File(desktopPath + "/File456.txt");
            if (file456.createNewFile()) {
                System.out.println("File456.txt created on Desktop.");
            } else {
                System.out.println("File456.txt already exists.");
            }
            File dir1 = new File(desktopPath + "/dir1");
            if (dir1.mkdir()) {
                System.out.println("Directory dir1 created on Desktop.");
            } else {
                System.out.println("Directory dir1 already exists.");
            }
            File dir2subdir1 = new File(desktopPath + "/dir2/subdir1");
            if (dir2subdir1.mkdirs()) {
                System.out.println("Directories dir2/subdir1 created on Desktop.");
            } else {
                System.out.println("Directories dir2/subdir1 already exist.");
            }
            File file654 = new File(desktopPath + "/File654.txt");
            if (file456.renameTo(file654)) {
                System.out.println("File456.txt renamed to File654.txt.");
            } else {
                System.out.println("Failed to rename File456.txt.");
            }

            // Step 7 : Under subdir1 , create two files : file11.txt and file22.txt
            File file11 = new File(dir2subdir1, "File11.txt");
            File file22 = new File(dir2subdir1, "File22.txt");
            if (file11.createNewFile()) {
                System.out.println("File11.txt created in subdir1.");
            } else {
                System.out.println("File11.txt already exists.");
            }
            if (file22.createNewFile()) {
                System.out.println("File22.txt created in subdir1.");
            } else {
                System.out.println("File22.txt already exists.");
            }

            // Step 8: Find all files and subdirectories in dir2 using listFiles
            System.out.println("Listing all files and subdirectories in dir2:");
            File dir2 = new File(desktopPath + "/dir2");
            File[] filesList = dir2.listFiles();
            if (filesList != null) {
                for (File file : filesList) {
                    System.out.println(file.getName() + (file.isDirectory() ? " [Directory]" : " [File]"));
                }
            } else {
                System.out.println("dir2 is empty or does not exist.");
            }

            // Step 9: Print the length of the file named File123.txt
            System.out.println("Length of File123.txt: " + file123.length() + " bytes");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}