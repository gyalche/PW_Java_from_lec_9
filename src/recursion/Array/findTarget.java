package recursion.Array;


import java.util.Scanner;

//Given an array of n integer and target value x. Find whether x exist in the array or not
public class findTarget {
    static boolean findTarget(int[]arr, int target, int idx){
        //base work;
        if(idx>=arr.length) return false;

        //self work;
        if(arr[idx]==target) return true;

        //recursive work;
        return findTarget(arr, target, idx+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(findTarget(arr, n,  0)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
