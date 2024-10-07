import java.util.Scanner;


public class four {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to 10 is: " + sum);
        System.out.println("Average of 1 to 10 is: " + (sum / 10));
    }
}
