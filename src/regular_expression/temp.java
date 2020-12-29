/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regular_expression;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author gagan
 */
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr1[] = new int[a];
        for(int i=0;i<a;i++)
            arr1[i] = sc.nextInt();
        
        int b = sc.nextInt();
        int arr2[] = new int[b];
        for(int i=0;i<b;i++)
            arr2[i] = sc.nextInt();
        
        SortedSet<Integer> s = new TreeSet();
        
        for(int i=0;i<a;i++)
            s.add(arr1[i]);
        for(int i=0;i<b;i++)
            s.add(arr2[i]);
        
        Iterator itr = s.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        
        
        
        
        /*String inp = sc.nextLine();
        String out = "";
        for(char c : inp.toCharArray()){
            if(c>=97 && c<=122){
                out += (char) (97+(((c-97)+13)%26));
            }else if(c>=65 && c<=90){
                out += (char) (65+(((c-65)+13)%26));
            }else{
                out += c;
            }
        }
        System.out.print(out);
       */
    }
}
