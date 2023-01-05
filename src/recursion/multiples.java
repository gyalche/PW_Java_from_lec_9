package recursion;

import java.util.Scanner;


//Q: Given a number num and a value k. Print k multiples of num.
public class multiples {

    static void printMultiples(int n, int k){

        //base case;
        if(k==1){
            System.out.println(n);
            return;
        }

        //recursive work;
        printMultiples(n, k-1);

        //self work;
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        printMultiples(n, k);
    }
}
