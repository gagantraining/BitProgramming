/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.*;

/**
 *
 * @author gagan
 */
public class usingHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        
        hm.put(100,"Hello");
        hm.put(200,"Hi");
        hm.put(300,"bye");
        System.out.println(hm);
        
        //getting value by key in a map
        System.out.println(hm.get(100));
        //what if the key doesn't exists
        System.out.println(hm.get(400)); //get method always returns null for missing key
        System.out.println(hm.getOrDefault(400, "No key as 400 exists"));
        
        //getting keys from a hashmap
        Set keys = hm.keySet();
        System.out.println(keys);
        
        //Travesing a Map using Iterator
        Set s = hm.entrySet();
        System.out.println(s);
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry ent =(Map.Entry) it.next();
            System.out.println("Key is "+ent.getKey()+" Value is "+ent.getValue());
        }
        
        
    }
}
