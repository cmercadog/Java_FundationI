/**
 * Exercise1
 * Create a phone validator that works in the following manner:

    > java phonevalidator.java
    Enter the phone number you want to validate: 7878648
    Your phone number "7878648" is not valid.
    
    Enter the phone number you want to validate: 0010 4352 4242424
    Your phone number "0010 4352 4242424" is valid.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Exercise1 {
     public static void main(String[] args) {
        Pattern phonePattern = Pattern.compile("^(\\(|\\+)?((\\d{2,4})(\\)?)(\\s|-|\\.)?)((\\d{2,4})(\\s|-|\\.)?+)((\\d{3})(-|\\.)?)(\\d{2,4}$)|\\d{9,13}$", Pattern.MULTILINE);
        while (true) {
            String phoneNumber = System.console().readLine("Enter the phone number you want to validate: ");
            Matcher matcher = phonePattern.matcher(phoneNumber);
            if (matcher.matches()) {
                System.out.println("Your phone number: " + phoneNumber + " is valid");
            } else {
                System.out.println("Your phone number: " + phoneNumber + " is not valid");
                
            }
          
        }
       
     }
    
}