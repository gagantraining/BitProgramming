/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gagan
 */
public class GarbageCollections {
    public void finalize(){
        System.out.println("Object deleted");
    }
    public static void main(String[] args) {
       Student s1 = new Student(5,"abc",5f);
       Student s2 = new Student(6,"dre",7f);
       s1 = null;
       s2 = null;
       System.gc();
       while(true);
    }
    
}
