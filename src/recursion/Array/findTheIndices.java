package recursion.Array;


import java.util.Scanner;

//Given an array arr of size n and an integer x. The task is to find all the indices of the integer x
//in the array;
//eg arr={1,2,3,4,2,3,2}
// int x=2;
// output=146
public class findTheIndices {

    static void findIndices(int[] arr, int x, int idx){
        //base case
       if(idx>=arr.length){
           return;
       }

        //self work
        if(arr[idx]==x){
            System.out.println(idx);
        }

        //recursion
        findIndices(arr, x, idx+1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,3,4,3};
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        findIndices(arr, target, 0);

    }
}
