package SolvingArrayProblem;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3};
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        //process is in the copy;


    }
}
