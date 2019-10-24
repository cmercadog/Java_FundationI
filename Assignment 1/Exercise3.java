/**
 * Exercise3
 */
import java.io.Console;

public class Exercise3 {

    public static void main(String[] args) {
        Console console= System.console();
        String word = console.readLine("Enter a palindrom: ");
        int start = 0;
        int end = word.length()-1;
        Boolean palin = true;
        while (start <= end)
          {
              if (word.charAt(start) != word.charAt(end))
                palin = false;
              start++;
              end--;
                        
          }
        System.out.println("Is the word " + word + " entered a Palindrom? " + palin);

    }
}