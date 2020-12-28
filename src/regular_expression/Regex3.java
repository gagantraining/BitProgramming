/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular_expression;

import java.util.regex.Pattern;


public class Regex3 {
    public static void main(String[] args) {
        // grouping using []
        System.out.println(Pattern.matches("[abc]?", "a"));
        System.out.println(Pattern.matches("[abc]?", "aab"));
        System.out.println(Pattern.matches("[abc]?", "abc"));
        
        System.out.println(Pattern.matches("[abc]+", "a"));
        System.out.println(Pattern.matches("[abc]+", "bbbbbb"));
        System.out.println(Pattern.matches("[abc]+", "aaabbbccct"));
        
        System.out.println(Pattern.matches("[abc]*", "a"));
        System.out.println(Pattern.matches("[abc]*", "aab"));
        System.out.println(Pattern.matches("[abc]*", "abctrx"));
        
    }
}
