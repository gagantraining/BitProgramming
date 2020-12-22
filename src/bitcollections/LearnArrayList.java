package bitcollections;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    int roll;
    String name;
    float marks;
    public Student(int roll,String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

   
}
public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(); //all elements stored in 
                                        //this arraylist are stored as Object
        arr.add(1);
        arr.add(2.5f);
        arr.add(3.567);
        arr.add("Hello");
        arr.add('c');
        System.out.println(arr); 
        
        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        //arr1.add("hello"); // this line is an error due to mismatch in generics
        System.out.println(arr1);
        // another form of add function
        arr1.add(1,10); //add(index,element)
        System.out.println(arr1);
        arr1.add(0,25);
        System.out.println(arr1);
        /*
            Exception in adding uneven indexes
        */
        //arr1.add(-2,20);
        //arr1.add(10,25);
        /*Fetching*/
        System.out.println(arr1.get(3));
        //System.out.println(arr1.get(10));
        
        /* sizes of list */
        System.out.println(arr1.size());
        /* Removing elements in arraylist */
        arr1.remove(2);   // this remove(2) will remove elemnt at index two
        /*
            This happens because the elements stored in the array list are simple 
            numbers to remove element two instead of index two we need to store all
            numbers as objects
        */
        System.out.println(arr1); 
        arr1.clear();
        arr1.add(new Integer(25));
        arr1.add(new Integer(1));
        arr1.add(new Integer(10));
        arr1.add(new Integer(2));
        arr1.add(new Integer(3));
        System.out.println(arr1);
        arr1.remove(new Integer(2));
        System.out.println(arr1);
        arr1.remove(new Integer(2));
        System.out.println(arr1);
        
        ArrayList<Student> data = new ArrayList();
        Student s1 = new Student(5,"Rajesh",25.3f);
        Student s2 = new Student(6,"Priya",29.5f);
        data.add(s1);
        data.add(s2);
        
        System.out.println("Roll: "+data.get(0).roll+"\t Name: "+data.get(0).name+"\t Marks: "+data.get(0).marks);
        System.out.println("Roll: "+data.get(1).roll+"\t Name: "+data.get(1).name+"\t Marks: "+data.get(1).marks);     
        
        ArrayList<Integer> data1 = new ArrayList();
        
        data1.add(20);
        data1.add(2);
        data1.add(10);
        data1.add(13);
        data1.add(7);
        data1.add(-2);
        data1.add(-10);
        System.out.println(data1);
        Collections.sort(data1);
        System.out.println(data1);
        
        Collections.shuffle(data1);
        System.out.println(data1);
        Collections.shuffle(data1);
        System.out.println(data1);
        Collections.shuffle(data1);
        System.out.println(data1);
        
        
    }
}
