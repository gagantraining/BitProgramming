/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2{
    String name;
    float marks;
    
    public Student2(String name,float marks){
        this.name = name;
        this.marks = marks;        
    }
}
class CompareMarks implements Comparator<Student2>{

    public int compare(Student2 o1, Student2 o2) {
       if(o1.marks == o2.marks)
           return 0;
       else if(o1.marks>o2.marks)
           return -1;
       else
           return 1;
    }
    
}
class CompareNames implements Comparator<Student2>{

    public int compare(Student2 o1, Student2 o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class LearnComparator {
    public static void main(String[] args) {
        ArrayList<Student2> ar = new ArrayList();
        
        ar.add(new Student2("Abhay",60.5f));
        ar.add(new Student2("Priya",70.5f));
        ar.add(new Student2("Gagandeep",65.5f));
        
        System.out.println(ar.get(0).name+" "+ar.get(0).marks);
        System.out.println(ar.get(1).name+" "+ar.get(1).marks);
        System.out.println(ar.get(2).name+" "+ar.get(2).marks);
        
        System.out.println("------------------------------------");
        Collections.sort(ar,new CompareMarks());
        
        System.out.println(ar.get(0).name+" "+ar.get(0).marks);
        System.out.println(ar.get(1).name+" "+ar.get(1).marks);
        System.out.println(ar.get(2).name+" "+ar.get(2).marks);
        
        System.out.println("------------------------------------");
        
        Collections.sort(ar,new CompareNames());
        System.out.println(ar.get(0).name+" "+ar.get(0).marks);
        System.out.println(ar.get(1).name+" "+ar.get(1).marks);
        System.out.println(ar.get(2).name+" "+ar.get(2).marks);
        
        System.out.println("------------------------------------");
        
    }
}
