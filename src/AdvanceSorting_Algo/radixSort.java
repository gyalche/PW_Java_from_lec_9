package AdvanceSorting_Algo;

public class radixSort {

    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static void radixSort(int[]arr){}
    public static void main(String[] args) {

    }
}
