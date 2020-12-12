
package bitcollections;

import java.util.Vector;

public class LearnVector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector();
        
        vec.add(10);
        vec.add(20);
        
        vec.addElement(30);
        vec.addElement(40);
        vec.addElement(50);
        vec.addElement(60);
        vec.addElement(70);
        System.out.println(vec);
        
        System.out.println(vec.subList(1, 4));
        
    }
}
