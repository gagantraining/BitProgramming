/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author gagan
 */
public class LargestNumberFormed {
    public static void main(String[] args) {
        int[] arr = {90,7,9,51}; //990751
        ArrayList<String> ar = new ArrayList();
        for (int i =0;i<arr.length;i++){
            ar.add(arr[i]+"");
        }
        System.out.println(ar);
        Collections.sort(ar,new Comparator<String>(){
            public int compare(String s1,String s2){
                    String xy = s1+s2; // 990
                    String yx = s2+s1; //909
                    
                    return xy.compareTo(yx)>0?-1:1;
            }
        });
        System.out.println(ar);
        for(int i=0;i<ar.size();i++){
            System.out.print(ar.get(i));
        }
    }
}
