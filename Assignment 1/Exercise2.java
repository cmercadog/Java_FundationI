
/**
 * Exercise2
 */
import java.io.Console;

public class Exercise2 {

  public static void main(String[] args) {
    Console console = System.console();
    int year = Integer.parseInt(console.readLine("Type a year: "));
    int century = year / 100;
    if (year % 100 != 0)
      century = century + 1;
    System.out.println("The Century for year " + year + " is " + century);

  }
}