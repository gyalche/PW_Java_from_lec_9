package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reverseArrayList {

    static void reverseArray(ArrayList<Integer> list){
        int start=0;
        int end=list.size()-1;

        while(start<end){
           Integer temp=Integer.valueOf(list.get(start));
           list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

    }
    public static void main(String[] args) {

        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);

        System.out.println("Original list " + l);
//        reverseArray(l);

        //inbuilt method to reverse;
        Collections.reverse(l);
        System.out.println("After reverse " + l);

    }
}
