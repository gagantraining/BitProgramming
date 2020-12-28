/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gagan
 */
public class Regex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abc"); //expression = "abc"
        Matcher m = p.matcher("hello"); // input = "hello"
        System.out.println(m.matches());
        m = p.matcher("abc"); // input = "abc"
        System.out.println(m.matches());
    }
}
