
package bitcollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class LearnSets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet();
        
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(5);
        hs.add(6);
        System.out.println(hs);
        
        TreeSet<Integer> ts = new TreeSet();
        
        ts.add(5);
        ts.add(6);
        ts.add(7);
        ts.add(5);
        ts.add(6);
        System.out.println(ts);
        
        System.out.println(ts.ceiling(4));
        System.out.println(ts.ceiling(14));
        
        System.out.println(ts.floor(8));
        System.out.println(ts.floor(2));
        
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
