package BinarySearch.RotatedSortedArray;

//Search element in rotated sorted array with duplicate elements. Return true if the element
//is found else return false;
//input:[0,0,0,1,1,2,0,0,0], target=2;
//output:true;
public class question2 {
    static boolean search(int[]a, int target){
        int start=0, end=a.length;
        int ans=-1;

    return true;
    }
    public static void main(String[] args) {
        int[]arr={0,0,0,1,1,2,0,0,0};
        int target=2;
        System.out.println(search(arr,target));
    }
}
