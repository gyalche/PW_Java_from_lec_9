package SolvingArrayProblem.ArrayManipulation;

//Given an array 'a' consisting of integers. Return the first value that is repeating in this array.
//if  no value is being repeated, return -1;

import java.util.Scanner;

public class findFirstRepeatValue {
    static int firstRepeatingNumber(int[] arr){
        int n=arr.length;
//        int ans=0;
        for(int i=0; i<n; i++){//first number
            for(int j=i+1; j<n; j++){//second number
                if(arr[i]==arr[j]){//found answer
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element for array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("First repeating Number: " + firstRepeatingNumber(arr));
    }
}
