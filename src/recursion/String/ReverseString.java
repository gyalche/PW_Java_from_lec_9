package recursion.String;

import java.util.Scanner;

public class ReverseString {
    static String reverse(String s, int idx){
        if(idx==s.length()) return " ";

        //recursive work;
        String smallAns=reverse(s, idx+1);

        //self work
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s,0));

    }
}
