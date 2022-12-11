package ArrayList;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        //Wrapper classes;
        Integer d= Integer.valueOf(3);
        System.out.println(d);
        Float f=Float.valueOf(4.4f);
        System.out.println(f);

        ArrayList<Integer> l1=new ArrayList<>();

        //add a new element;
        l1.add(5);
        l1.add(6);
        l1.add(7);


        //get an element ar index i;
        System.out.println(l1.get(0));

        //Print with  for loop;
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

        //Print the ArrayList directly;
        System.out.println(l1);

        //adding element at some index i;
        l1.add(1, 100);
        System.out.println(l1);

        //modifying element at  some index i;
        l1.set(1, 10);
        System.out.println(l1);

        //removing an element at index i;
        l1.remove(0);
        System.out.println(l1);

        //removing an element e;
        l1.remove(Integer.valueOf(10));
        System.out.println(l1);

        //checking if an element exists;
        boolean ans=l1.contains(7);
        System.out.println(ans );

        //If you dont specify class you can put anythig inside;
        ArrayList l=new ArrayList();
        l.add("Dawa don");
        l.add("Gyalchen");
        l.add("Sherpa");
        l.add("Goparma");
        System.out.println(l.get(2));
        l.set(0,"dawa sherpa");
        System.out.println(l.isEmpty());
    }
}
