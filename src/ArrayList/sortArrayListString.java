package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayListString {
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

        //inbuilt method to sort;
        Collections.sort(l);
        System.out.println(" Ascending order Sorting " + l);

        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Descending order Sorting " + l);
    }
}
