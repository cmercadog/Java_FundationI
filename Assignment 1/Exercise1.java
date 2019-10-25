import java.io.Console;
import java.lang.Math;

public class Exercise1 {
    public static void main(String[] args) {
        Console console = System.console();
        int n = Integer.parseInt(console.readLine("Enter a number n: "));
        int largeDigitNumber = (int) Math.pow(10, n) - 1;
        System.out.println("The largest number that contains exactly " + n + " digits is " + largeDigitNumber);

    }
}