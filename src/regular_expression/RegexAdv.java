
package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexAdv {
    public static void main(String[] args) {
        String x = "123abcd121dfeg43uo-iun-9gh";
        Pattern p = Pattern.compile("(-)?\\d+");
        Matcher m = p.matcher(x);
        
        while(m.find()){
            System.out.println(m.group());
        }
            
        
    }
}
