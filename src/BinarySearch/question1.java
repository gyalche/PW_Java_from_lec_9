package BinarySearch;

//Find the first occurance of a given element x, given that the given array is sorted, If no
//occurance of x is found then return -1;

//input arr=[2,5,5,5,6,6,8,9,9,9]
//x=5;
//output=1;
public class question1 {
    static int firstOccurance(int[]a, int x){
        int n=a.length;
        int start=0, end=n-1;
        int ans=-1;
        while (start<end){
            int mid= start + (end - start) /2;
            if(x==a[mid]){
                ans=mid;
                end=mid-1;
            }else if(x>a[mid]){
                start=mid+1;

            }else{
                end=mid-1;
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        int[]arr={2,5,5,5,6,6,8,9,9,9};
        int x=5;

        System.out.println(firstOccurance(arr, x));
    }
}
