package recursion.String;

import java.util.Scanner;

public class Palindrom {
    static String reverse(String s, int idx){
        if(idx==s.length()) return "";
        String smallAns=reverse(s, idx+1);
        return smallAns + s.charAt(idx);
    }
    //another way;
    static Boolean isPalindrom(String s, int l, int r){
        if(l>=r) return true;
        return(s.charAt(l)==s.charAt(r) && isPalindrom(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to check whether its palindrom or not");
        String s=sc.nextLine();
        String rev=reverse(s, 0);

        if(rev.equals(s)){
            System.out.printf("%s is Palindrom", s);
        }else{
            System.out.printf("%s is Not Palindrom", s);
        }

        System.out.println(isPalindrom(s, 0, s.length()-1));

    }
}
