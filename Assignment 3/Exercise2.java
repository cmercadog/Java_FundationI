/**
 * Exercise2
 * Given the following list of numbers extract the phone information in separate lists, on list which hold all
 * "Operator Code", another with all "City Codes" and another with "Phone Numbers", each list should contain only unique values.
 * and the system should give us:

    > java phoneextractor.java
    Operator Codes: [0010, 0011, 12, 13, 0014]
    City Codes: [44, 2289, 4]
    Phone Numbers: [4242424]
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
             
      Pattern phonePattern = Pattern.compile("^(\\(|\\+)?((\\d{2,4})(\\)?)(\\s|-|\\.)?)((\\d{1,4})(\\s|-|\\.)?)((\\d{3})(-|\\.)?)(\\d{2,4}$)|\\d{9,13}$", Pattern.MULTILINE);
      
      HashSet<String> operatorCode = new HashSet<>();
      HashSet<String> cityCode = new HashSet<>();
      HashSet<String> phoneNumbers = new HashSet<>();
       
       
        ArrayList<String> phoneNumberValid = new ArrayList<>();
      
        String text = Files.readString(Path.of("D:\\Automation\\Java_FundationI\\Assignment 3\\phoneNumbersList.txt"));  
        
        phoneNumberValid = ValidPhoneNumber(text);
        System.out.println("Operator Codes are: " + phoneNumberValid);

        for (int i = 0; i < phoneNumberValid.size(); i++) {
                        
           Matcher matcherOperator = phonePattern.matcher(phoneNumberValid.get(i));

          while(matcherOperator.find()) {
             
             operatorCode.add(matcherOperator.group(3));
          }

          Matcher matcherCityCode = phonePattern.matcher(phoneNumberValid.get(i));

          while(matcherCityCode.find()) {
             cityCode.add(matcherCityCode.group(7));
          }

          Matcher matcherPhoneNumber = phonePattern.matcher(phoneNumberValid.get(i));

          while(matcherPhoneNumber.find()) {
             phoneNumbers.add(matcherPhoneNumber.group(10)+matcherPhoneNumber.group(12));
          }

         }
        System.out.println("Operator Codes are: " + operatorCode);
        System.out.println("City Codes are: " + cityCode);
        System.out.println("Phone Numbers are: " + phoneNumbers);

    }

    public static ArrayList<String> ValidPhoneNumber(String fileText){
      Pattern phonePattern = Pattern.compile("^(\\(|\\+)?((\\d{2,4})(\\)?)(\\s|-|\\.)?)((\\d{1,4})(\\s|-|\\.)?)((\\d{3})(-|\\.)?)(\\d{2,4}$)|\\d{9,13}$", Pattern.MULTILINE);
      
      ArrayList<String> numbersList = new ArrayList<>();
      

      Matcher matcher = phonePattern.matcher(fileText);

      while(matcher.find()) {
         numbersList.add(matcher.group());
      }
      return numbersList;



    }
}