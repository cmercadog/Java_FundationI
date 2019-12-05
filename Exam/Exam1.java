/**
 * Exam 1
 * Crear un programa que valide si una dirección IPV4 es valida o no, un dirección IPV4 
 * consta de cuatro grupos de números que van de 0 a 255 separados por `.` 

**Validos:**

- 121.18.19.20
- 255.255.255.0
- 121.178.129.20

**Inválidos:**

- 453.14.25.21
- 121.18.19.20.1
- 0.0.1555.2
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Console;

public class Exam1 {
    public static void main(String[] args) {
        Pattern iPv4Pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", Pattern.MULTILINE);

        while (true) {
            String iPv4Number = System.console().readLine("Enter the iPv4 number you want to validate: ");
            Matcher matcher = iPv4Pattern.matcher(iPv4Number);
            if (matcher.matches()) {
                System.out.println("Your iPv4 number: " + iPv4Number + " is valid");
            } else {
                System.out.println("Your iPv4 number: " + iPv4Number + " is not valid");
                
            }
          
        }
    }
    
        
  

    
}