package recursion.GCD;

import java.util.Scanner;

//Given two number x and y. Find the greatest common divisor of x and y using recursion;
public class greatesCommomDivisior {
    //Interative method to find GCD
    static int igcd(int x, int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    //Recursion- to find GCD
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(igcd(x,y));
        System.out.println("GCD using recursion");
        System.out.println(gcd(x, y));
    }
}
