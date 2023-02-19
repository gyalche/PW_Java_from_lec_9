package BinarySearch;

public class withRursive {
    static boolean RecursiveBinary(int[]a, int start, int end, int target){
        //base case
        if(start>end) return false;

      int mid=(start + end)/2;
      if(target ==a[mid]) {
          return true;
      }else if(target<a[mid]){
          return RecursiveBinary(a, start, mid-1, target);
      }else{
          return RecursiveBinary(a, end+1, end, target);
      }
    }
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7};
        int target=0;
        int n=a.length;
        int start=0;
        int end=n-1;
        System.out.println(RecursiveBinary(a,start, end, target));


    }
}
