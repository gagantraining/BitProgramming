/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
    String name;
    float marks;
    
    public Student1(String name,float marks){
        this.name = name;
        this.marks = marks;        
    }

    /*public int compareTo(Student1 s) {
        if(marks == s.marks)
            return 0;
        else if(marks>s.marks)
            return 1;
        else
            return -1;
    }*/
    public int compareTo(Student1 s) {
        if(marks == s.marks)
            return 0;
        else if(marks>s.marks)
            return -1;
        else
            return 1;
    }
    
    
    
}
public class LearnComparable {
    public static void main(String[] args) {
        ArrayList<Student1> ar = new ArrayList();
        
        ar.add(new Student1("Rahul",50.5f));
        ar.add(new Student1("Rajesh",70.5f));
        ar.add(new Student1("Rohit",55.5f));
        
        System.out.println(ar.get(0).name+" "+ar.get(0).marks);
        System.out.println(ar.get(1).name+" "+ar.get(1).marks);
        System.out.println(ar.get(2).name+" "+ar.get(2).marks);
        
        Collections.sort(ar);
        
        System.out.println(ar.get(0).name+" "+ar.get(0).marks);
        System.out.println(ar.get(1).name+" "+ar.get(1).marks);
        System.out.println(ar.get(2).name+" "+ar.get(2).marks);
        
    }
}
