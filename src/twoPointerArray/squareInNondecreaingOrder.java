package twoPointerArray;

//Given an integer array 'a' sorted in non-decreaing order, return an array of the square of each number;
//sorted in none-decreasing order;
import java.util.Scanner;

public class squareInNondecreaingOrder {
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int i=0; int j=arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }

    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        int[] ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left]) >  Math.abs(arr[right])){
                ans[k++]=arr[left] * arr[left];
                left++;
            }else{
                ans[k++]= arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int [] arr = {-10,-3,-2,1,4,5};
        System.out.println("Original Array");
        printArray(arr);
        System.out.println("Soreted array");
        int[]ans=sortSquare(arr);
        printArray(ans);

    }
}
