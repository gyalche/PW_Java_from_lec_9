package recursion.Array;

public class findSum {
    static int sumRecursion(int[] arr, int idx){
        if(idx==arr.length){
            return 0;
        }
        //recursion
         int smallAns= sumRecursion(arr, idx+1);
        return smallAns+arr[idx];

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(sumRecursion(arr, 0));
    }
}
