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
public class UsingMaps2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap();
       /* Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.print("Enter Key ");
            int k = sc.nextInt();
            System.out.print("Enter Value ");
            String s = sc.next();
            hm.put(k,s);
            System.out.print("Do you want to enter more Y/n ");
            ch = sc.next().charAt(0);
        }while(ch!='n');*/
        hm.put(10, "Rahul");
        hm.put(8,"Amit");
        hm.put(12,"Danny");
        System.out.println(hm);
        
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("comparing by value");
         hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
       
    }
}
