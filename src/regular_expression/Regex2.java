
package regular_expression;

import java.util.regex.Pattern;


public class Regex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("xyz", "xyzz"));
        System.out.println(Pattern.matches("xyz", "xyz"));
        
        // the dot(.) quantifier
        
        //to see if the second character in a 3 letter string is 'a' or not
        System.out.println(Pattern.matches(".a.", "abc"));
        System.out.println(Pattern.matches(".a.", "cat"));
        System.out.println(Pattern.matches(".a.", "batt"));
        
        // the  question mark (?) quantifier
        System.out.println(Pattern.matches("a?bc", "aabc"));
        System.out.println(Pattern.matches("a?bc", "bc"));
        System.out.println(Pattern.matches("a?bc", "abc"));
        System.out.println(Pattern.matches("a?bc", "bca"));
        
        // the  plus (+) quantifier
        System.out.println(Pattern.matches("a+bc", "aabc"));
        System.out.println(Pattern.matches("a+bc", "bc"));
        System.out.println(Pattern.matches("a+bc", "abc"));
        System.out.println(Pattern.matches("a+bc", "bca"));
        
        // the  asterix (*) quantifier
        System.out.println(Pattern.matches("a*bc", "aabc"));
        System.out.println(Pattern.matches("a*bc", "bc"));
        System.out.println(Pattern.matches("a*bc", "abc"));
        System.out.println(Pattern.matches("a*bc", "bca"));
        
        
        
        System.out.println(Pattern.matches("a{3}", "aa"));
        System.out.println(Pattern.matches("a{3}", "aaaa"));
        System.out.println(Pattern.matches("a{3}", "aaa"));
        
        System.out.println(Pattern.matches("a{3,}", "aa"));
        System.out.println(Pattern.matches("a{3,}", "aaaa"));
        System.out.println(Pattern.matches("a{3,}", "aaa"));
        
        System.out.println(Pattern.matches("a{2,4}", "aa"));
        System.out.println(Pattern.matches("a{2,4}", "aaa"));
        System.out.println(Pattern.matches("a{2,4}", "aaaa"));
        System.out.println(Pattern.matches("a{2,4}", "a"));
        System.out.println(Pattern.matches("a{2,4}", "aaaaa"));
    }
}
