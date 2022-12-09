package LeetCode;

public class RotateArray {
    static void  reverse(int[] nums, int start, int end){
//        start=0;
//        end=nums.length;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
    static void rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k);
        reverse(arr, k, n-1);


    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        System.out.println("Rotate array of 3 is ");



    }
}
