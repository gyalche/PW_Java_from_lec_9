package LeetCode;


//int array is given in non-decreasing order, remove the duplicates in-place such that each unique element appears
// only once. The relative order of the elements should be kept the same
//do not allocate extra space
//e.g input num=[0011122334]
//output: 5, num=[01234....]

public class removeDuplicate {
    static int removeDup(int[] nums){
        int j=0;
        for(int i=0;i<nums.length; i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return ++j;
    }
    public static void main(String[] args) {

        int[] arr={1,1,2,2,2,3,3,4};
        removeDup(arr);
        System.out.println(removeDup(arr));
    }
}
