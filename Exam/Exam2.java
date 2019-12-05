/**
 * Exam 2
 * Cree un programa que dado un arreglo de números encuentre el primer elemento que se repite o -1 en caso de no haber elementos repetidos.

1. Dado `[2, 1, 3, 5, 3, 2]` el primer elemento que se repite es `3`
2. Dado `[2, 4, 3, 5, 1]` ya que no existe elementos repetidos el resultado es `-1`
3. Dado `[2, 1, 1, 5, 3, 2]` el primer elemento que se repite es `1`
4. Dado `[8, 4, 6, 2, 6, 4, 7, 9, 5, 8]` el primer elemento que se repite es `6`
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.Console;


public class Exam2 {
    public static void main(String[] args) {

        Console console = System.console();

        int NUMBER_OF_ELEMENTS = Integer.parseInt(console.readLine("How many elements do you want to read?: "));
        
        int[] array_Of_Numbers = new int[NUMBER_OF_ELEMENTS];
        
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            array_Of_Numbers[i] = Integer.parseInt(console.readLine("Type an Element: "));
        }

        int repeatedNumber = returnRepitedValue(array_Of_Numbers);

        if ( repeatedNumber == -1) {
            System.out.println("There are not repeated numbers: " + repeatedNumber);
        } else {
            System.out.println("First repeated number is: " + repeatedNumber);
        }
     
    }

    public static int returnRepitedValue(int[] arrayOfNumbers) {
        HashSet<Integer> numbers = new HashSet<>();
        boolean sucsseful;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int NumberValue = arrayOfNumbers[i];
            sucsseful = numbers.add(NumberValue);
            if (!sucsseful) {
                return NumberValue;
            }
        }

        return -1;

    }

}
