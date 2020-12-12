/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author gagan
 */
public class DuplicateRemovalSets {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(10);
        arr.add(2);
        arr.add(5);
        arr.add(10);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(11);
        arr.add(13);
        arr.add(5);
        arr.add(4);
        System.out.println(arr);
        
        TreeSet<Integer> out = new TreeSet();
        for(int i=0;i<arr.size();i++){
            out.add(arr.get(i));
        }
        System.out.println(out);
    
        LinkedHashSet<Integer> orderedout = new LinkedHashSet();
        for(int i=0;i<arr.size();i++){
            orderedout.add(arr.get(i));
        }
        System.out.println(orderedout);
        
        
    }
}
