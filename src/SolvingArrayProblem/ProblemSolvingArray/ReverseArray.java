package SolvingArrayProblem.ProblemSolvingArray;
import java.util.Scanner;
public class ReverseArray {
    static int[] reverseArray(int[] arr){
    int n=arr.length;
    int[] ans=new int [n];

    int j=0;
    //traverse original  in reverse direction;
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }

        return ans;
    }

    static void swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseOriginalArray(int [] arr){

        int i=0;
        int j=arr.length-1;
        while(i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println("Enter the size of an array");
        int[] arr= {1,2,3,4,5};
        int[] ans=reverseArray(arr);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i] + " ");
        }

        reverseOriginalArray(arr);


    }
}
