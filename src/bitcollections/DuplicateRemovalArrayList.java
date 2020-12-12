
package bitcollections;

import java.util.ArrayList;


public class DuplicateRemovalArrayList {
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
        
        ArrayList<Integer> out = new ArrayList();
        for(int i=0;i<arr.size();i++){
            int x = arr.get(i);
            if(out.indexOf(x)!=-1){
                continue;
            }
            out.add(x);
        }
        System.out.println(out);
    }
}
