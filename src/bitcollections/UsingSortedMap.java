/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author gagan
 */
public class UsingSortedMap {
    public static void main(String[] args) {
        SortedMap<Integer,String> sm = new TreeMap<Integer,String>();
        sm.put(10, "Rahul");
        sm.put(8,"Amit");
        sm.put(12,"Danny");
        System.out.println(sm);   
    }
}
