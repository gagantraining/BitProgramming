/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;


public class MobileValidation {
    public static void main(String[] args) {
        /*
            1) should start with either 6,7,8,9
            2) should be 10, 11 or 12 digits
            3) only digits from 0-9 allowed
        */
        Scanner sc = new Scanner(System.in);
        String mobile;
        while(true){
            System.out.print("Enter Mobile ");
            mobile = sc.next();
            if(Pattern.matches("[6-9]{1}[0-9]{9,11}", mobile))
                System.out.println("Valid Number");
            else
                System.out.println("Invalid Number");
            
            System.out.print("Do you want to enter more (Y/n) ");
            if(sc.next().toLowerCase().charAt(0) != 'y')
                break;
        }
        
    }
}
