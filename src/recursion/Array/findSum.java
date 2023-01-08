package recursion.Array;

public class findSum {
    static int sumRecursion(int[] arr, int idx){
        if(idx==arr.length){
            return 0;
        }

        //recursion

         int smallAns= sumRecursion(arr, arr[idx+1]);
            return smallAns+arr[idx];



    }
    public static void main(String[] args) {
        int[] arr={2,3,5,20,1};
        int idx=0;
        System.out.println(sumRecursion(arr, idx));

    }
}
