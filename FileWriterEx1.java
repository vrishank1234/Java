import java.io.*;

public class FileWriterEx1 {
    public static void main(String[] args) {
        String str = "We are all born with a divine fire in us." +
                " Our efforts should be to give wings to this fire and " +
                "fill the world with the glow of its goodness.";
        
        int len = str.length();
        char[] buff = new char[len];
        
        // Copy the characters from the string to the character array
        str.getChars(0, str.length(), buff, 0);

        try (FileWriter fout1 = new FileWriter("checkFileInput/new.txt");
             FileWriter fout2 = new FileWriter("checkFileInput/new.txt");
             FileWriter fout3 = new FileWriter("checkFileInput/new.txt");
             FileWriter fout4 = new FileWriter("checkFileInput/new.txt");
             FileWriter fout5 = new FileWriter("checkFileInput/copy.txt", true)) {

            // Writing the full string to fout1
            fout1.write(str);

            // Appending the first character of the string to fout1
            fout1.append(str.charAt(0));

            // Writing the first quarter of the buffer array to fout2
            for (int i = 0; i < len / 4; i++) {
                fout2.write(buff[i]);
            }

            // Appending newline character to fout2
            fout2.append("\n"); 

            // Appending part of the string to fout2 using a StringBuilder
            StringBuilder sb = new StringBuilder("\nAppending to fout2");
            fout2.append(str, len / 2, len); // Appending half of the string to fout2
            fout2.append(sb); // Appending the StringBuilder to fout2

            // Writing the entire buffer to fout3
            fout3.write(buff);

            // Writing the last quarter of the buffer to fout4
            fout4.write(buff, len - len / 4, len / 4);

            // Writing a quote directly to fout4
            fout4.write("Quote by APJ Abdul Kalam");

        } catch (IOException e) {
            System.out.println("Error in file handling");
        }
    }
}