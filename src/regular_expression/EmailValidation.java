
package regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        /*
            1) should start with chars
            2) should have @ symbol
            3) atleast 2 chars before @ symbol
            4) should have a domain name (.in,.com,.org)
        */
        Scanner sc = new Scanner(System.in);
        String email,regex;
        while(true){
            System.out.print("Enter Email ");
            email = sc.next();
            regex = "[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*(\\.[A-Za-z]{2,})";
            if(Pattern.matches(regex, email))
                System.out.println("Valid Email");
            else
                System.out.println("Invalid Email");
            
            System.out.print("Do you want to enter more (Y/n) ");
            if(sc.next().toLowerCase().charAt(0) != 'y')
                break;
        }
    }
}
