package Prefix_Sum;

//Given an integer array a, return the prefix sum/running sum in the  same array without
//creating a new array;

import java.util.Scanner;

public class prefixSum {

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr){
        int n=arr.length;
        int [] pref = new int[n];
        pref[0]=arr[0];
        for(int i=1; i<n; i++){
            pref[i]=pref[i-1] + arr[i];
        }
        return pref;
    }

    //without  using another array;
    static int[]  originalPrefix(int[] arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1] + arr[i];
        }
        return arr;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        int[] pref=makePrefixSum(arr);
        printArray(pref);

        int[] another=originalPrefix(arr);
        printArray(another);

    }
}
