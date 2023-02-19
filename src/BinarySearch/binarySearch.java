package BinarySearch;

public class binarySearch {
    static boolean binary(int[]a, int target){
        int n=a.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==a[mid]){
                return true;
            }
            else if(target<a[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int target=3;
        System.out.println(binary(a, target));
    }
}
