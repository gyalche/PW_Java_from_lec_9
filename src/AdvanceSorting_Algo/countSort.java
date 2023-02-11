package AdvanceSorting_Algo;

public class countSort {
    static void display(int[]arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static int findMax(int[]arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;  i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[]arr){
        //find the largest element of the array;
        int max=findMax(arr);

        //frequency;
        int [] count=new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={1,4,5,2,2,5};
        basicCountSort(arr);
        display(arr);
    }
}
