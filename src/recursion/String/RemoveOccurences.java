package recursion.String;

import java.util.Scanner;

public class RemoveOccurences {
    static String removeA(String s, int idx){
        //base case;
        if(idx==s.length()) return " ";

        //recursive work;
        String smallAns=removeA(s, idx+1);

        char currentChar=s.charAt(idx);
        //self work
        if(currentChar !='a'){
            return currentChar + smallAns;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string");
        String s=sc.nextLine();

        System.out.println(removeA(s,0));


    }
}
