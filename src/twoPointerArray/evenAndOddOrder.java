package twoPointerArray;

//given an array of integers, 'a', move all the even integers at the begining of the array;
//followed by all the odd integers. The relative order of odd or even integers does not matter.
//Return any array that satisfies the condition;

import java.util.Scanner;

public class evenAndOddOrder {

    static void swap(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void sortArrayByParity(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }

    }
    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("After sorting even and odd " + arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the element");
            arr[i]=sc.nextInt();
        }
        sortArrayByParity(arr);

        printArray(arr);

    }
}
