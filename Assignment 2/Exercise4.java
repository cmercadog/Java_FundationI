
/**
 * Exercise4 If two arrays are equal, then a mismatch should return -1. But if
 * two arrays are not equal, then a mismatch should return the index of the
 * first mismatch between the two given arrays.
 */
import java.io.Console;

public class Exercise4 {

    public static void main(String[] args) {
        int[] firstTestArrayOne = { 1, 2, 3, 4, 5, 6 };
        int[] firstTestArrayTwo = { 1, 2, 3, 4, 5, 6 };

        int resultFirstTest = mismatch(firstTestArrayOne, firstTestArrayTwo);
        System.out.println("They are equal: " + resultFirstTest); // result should be -1

        int[] secondTestArrayOne = { 1, 2, 3, 4, 5, 6 };
        int[] secondTestArrayTwo = { 1, 2, 3, 4, 2, 6 };

        int resultSecondTest = mismatch(secondTestArrayOne, secondTestArrayTwo);
        System.out.println("They are not equal in position: " + resultSecondTest); // result should be 4

    }

    public static int mismatch(int[] left, int[] right) {
        boolean iguales = false;
        int indice = 0;

        for (int i = 0; i < left.length; i++) {
            if (left[i] == right[i]) {
                iguales = true;
            } else {
                iguales = false;
                indice = i;
                break;

            }

        }

        if (!iguales) {
            return indice;
        } else {
            return -1;
        }

    }
}
