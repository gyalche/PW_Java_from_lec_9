package recursion;

import java.util.Scanner;

public class main {

    static void printIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    static void printDecreasing(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }

        //self work
        System.out.println(n);

        //recursive work
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
        System.out.println("below print decreasing recursion");
        printDecreasing(n);

    }
}
