package SolvingArrayProblem;

import java.util.Scanner;

public class Triplet {

    static  int tripletSum(int[]arr, int target){
        int ans=0;
        int n=arr.length;
        for(int i=0; i<n; i++){ //first number
            for(int j=i+1; j<n; j++){//second number
                for(int k=j+1; k<n; k++){ //third number
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the array element");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int target=sc.nextInt();
        tripletSum(arr,target);
    }
}
