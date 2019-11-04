/**
 * Exercise2
 * Make a program that counts the number of occurrences of every repeating word, not you should ignore those words that are not repeating. 
 *     "This is is a new text text that have repeating repeating repeating words"
    
    //Result:
    is:        2
    text:      2
    repeating: 3
 */
import java.util.HashMap;

public class Exercise2 {
public static void main(String[] args) {
    
 
        String value = "This is is a new text text that have repeating repeating repeating words";
        String [] arrayWords = value.split(" ");
        
        HashMap<String, Integer> repeatingWord = new HashMap<>();
        
        for (int i = 0; i < arrayWords.length; i++) {
            String wordValue = arrayWords[i];      
            Integer currentQuantity = repeatingWord.getOrDefault(wordValue, 0);
          
            repeatingWord.put(wordValue, ++currentQuantity);
      
        }

        for (int i = 0; i < arrayWords.length; i++) {
            int quantity = repeatingWord.get(arrayWords[i]);
            if (quantity == 1) {
                repeatingWord.remove(arrayWords[i]);
            }
                         
        }
        System.out.print(repeatingWord);
    }
    
}