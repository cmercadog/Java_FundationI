/**
 * Exercise3
 * Two strings that have the same characters, but that are in a different order, are anagrams. 
 * For this exercise anagramas are case-insensitive and white spaces should be ignored.
 */
import java.io.Console;
import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {
        Console console = System.console();
        String textOne = console.readLine("Enter first text: ").toLowerCase();
        String textTwo = console.readLine("Enter second text: ").toLowerCase();

        HashMap<Character, Integer> repeatingCharacterI = new HashMap<>();
        HashMap<Character, Integer> repeatingCharacterII = new HashMap<>();

        for (int i = 0; i < textOne.length(); i++) {
            char charValue = textOne.charAt(i);
            if (charValue != ' ') {
                
                Integer currentQuantity = repeatingCharacterI.getOrDefault(charValue, 0);
                repeatingCharacterI.put(charValue, ++currentQuantity);
            }
            
                     
        }
        for (int i = 0; i < textTwo.length(); i++) {
            char charValue = textTwo.charAt(i);     
            if (charValue != ' ') {
                Integer currentQuantity = repeatingCharacterII.getOrDefault(charValue, 0);
                repeatingCharacterII.put(charValue, ++currentQuantity);
            } 
            
      
        }
       

        if (repeatingCharacterI.equals(repeatingCharacterII)) {
            System.out.print("Texts are equal"); 
        } else {
            System.out.print("Texts are not equal"); 
        }

        
       
    }

    }

    
