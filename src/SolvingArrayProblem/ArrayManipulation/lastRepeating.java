package SolvingArrayProblem.ArrayManipulation;

import java.util.Scanner;

public class lastRepeating {
    static int lastRepeat(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>0; j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of an array");

        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the element for array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Last repeating number: " + lastRepeat(arr));
    }
}
