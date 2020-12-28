/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular_expression;

import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]?","a"));
        System.out.println(Pattern.matches("[a-z]?","k"));
        System.out.println(Pattern.matches("[a-j]?","m"));
        System.out.println(Pattern.matches("[a-fm-p]?","c"));
        System.out.println(Pattern.matches("[a-fm-p]?","n"));
        System.out.println(Pattern.matches("[a-fm-p]?","i"));
        System.out.println(Pattern.matches("[a-z]?","N"));
        System.out.println(Pattern.matches("[a-z]?","#"));
        System.out.println(Pattern.matches("[a-z]?","5"));
        
        System.out.println(Pattern.matches("[a-zA-Z]+","dsafsaGJDGJdsafbasfj"));
        System.out.println(Pattern.matches("[a-zA-Z]+","dsdasFDA9"));
        System.out.println(Pattern.matches("[a-zA-Z]+","dsdas*FDA"));
        
        System.out.println(Pattern.matches("[0-9]?", "0"));
        System.out.println(Pattern.matches("[0-9]?", "s"));
        
        System.out.println(Pattern.matches("[^a-zA-Z]+","dsafsaGJDGJdsafbasfj"));
        System.out.println(Pattern.matches("[^a-zA-Z]+","!#$@%#32523523"));
        
    }
}
