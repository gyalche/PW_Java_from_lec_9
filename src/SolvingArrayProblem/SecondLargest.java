package SolvingArrayProblem;

public class SecondLargest {

    static int findMax(int []arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;


    }
    static int findSecondMax(int[] arr){
        int max=findMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);

        return secondMax;
    }
    public static void main(String[] args) {



    }
}
