package Array;

import java.util.Scanner;

public class ArrayInput {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);

        //Array reference
        int[] arr_2=arr;
        System.out.println("Copied array");
        printArray(arr_2);

        //change some value of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("orinal array ater changin arr");
        printArray(arr);

        System.out.println("copied array ater changing arr_2");
        printArray(arr_2);
    }
}
