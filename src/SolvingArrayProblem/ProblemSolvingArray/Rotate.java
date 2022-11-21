package SolvingArrayProblem.ProblemSolvingArray;

import java.util.Scanner;

public class Rotate {
    static int[] rotate(int[]arr, int k){
        int n=arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j=0;

        for(int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter how many you want to rotate");
        int r=sc.nextInt();

        System.out.println("Print originnal Array");
        printArray(arr);

        int [] ans=rotate(arr, r);
        System.out.println("Arrary afoter rotation");
        printArray(ans);


    }
}
