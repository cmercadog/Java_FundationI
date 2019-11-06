
/**
 * Exercise1
 *  Minimum, maximum, and average of an int array
 *  Make a program that computes the minimum, maximum, and average of an int array
    {1, 2, 3, 4, 5, 6, 7} 
    //Min Value:      1
    //Max Value:      7
    //Average Value:  4
 */
import java.io.Console;

public class Exercise1 {

    public static void main(String[] args) {
        Console console = System.console();
        int NUMBER_OF_ELEMENTS = Integer.parseInt(console.readLine("How many elements do you want to read?: "));
        int[] array_Of_Numbers = new int[NUMBER_OF_ELEMENTS];
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            array_Of_Numbers[i] = Integer.parseInt(console.readLine("Type an Element: "));
        }
        minimum_value(array_Of_Numbers);
        maximum_value(array_Of_Numbers);
        average_value(array_Of_Numbers, NUMBER_OF_ELEMENTS);

    }

    public static void minimum_value(int[] array_minimum) {

        int min = array_minimum[0];
        for (int i = 1; i < array_minimum.length; i++) {
            if (min > array_minimum[i]) {
                min = array_minimum[i];
            }

        }
        System.out.println("The minimum value is: " + (min));

    }

    public static void maximum_value(int[] array_maximum) {

        int max = array_maximum[0];
        for (int i = 1; i < array_maximum.length; i++) {
            if (max < array_maximum[i]) {
                max = array_maximum[i];
            }

        }
        System.out.println("The maximum value is: " + (max));

    }

    public static void average_value(int[] array_average, int NUM_ELEMENTS) {

        int sum = 0;
        int ave = 0;
        for (int i = 0; i < array_average.length; i++) {

            sum = sum + array_average[i];
        }
        ave = sum / NUM_ELEMENTS;

        System.out.println("The average value is: " + (ave));

    }
}