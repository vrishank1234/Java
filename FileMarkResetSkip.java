import java.io.*;
import java.io.IOException;

class FileMarkResetSkip{
    public static void main (String [] args) throws IOException{
        try(BufferedReader is=new BufferedReader(new FileReader("File.txt"));){
            System.out.println((char)is.read());
            System.out.println("If mark is supported"+is.markSupported() );
            if (is.markSupported())
            {
                is.mark(100);
                System.out.println((char)is.read());
                System.out.println((char)is.read());
                is.reset();
            }
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            is.skip(2);
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
        }
    }
}