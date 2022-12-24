package recursion;

import java.util.Scanner;

public class solvingProblem {
    static int factorial(int n){

        //base case
        if(n==0){
            return 1;
        }
        //sammer problem-recursive work;
        int smallAns=factorial(n-1);

        //big problem;
        int ans=n*smallAns;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

//        factorial(n);
        System.out.println(factorial(n));
    }
}
