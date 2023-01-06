package recursion.Array;

//Given an array print all its value recursively;
public class basicPrintAllArray {
    static void printArray(int[] arr, int idx){
        int n=arr.length;
        //base case
        if(idx==n){
            return;
        }

        //self work;
        System.out.println(arr[idx]);

        //recursive work-smaller problem;
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr={9,8,6,5,4};

        printArray(arr, 0);

    }
}
