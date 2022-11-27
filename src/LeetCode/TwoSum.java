package LeetCode;

import java.util.Scanner;

//Given an array of integers nums and an integer target, return indices of the two number such
//that they add up to target
public class TwoSum {

    static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; i<nums.length; j++){
                if(nums[i] + nums[i]==target){
                    int[] a={i,j};
                    return a;
                }
            }

        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,5,7};
        int target=10;

        System.out.println("The ans is " + twoSum(arr, target) );

    }
}
