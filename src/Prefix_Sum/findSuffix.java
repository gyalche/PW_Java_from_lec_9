package Prefix_Sum;

public class findSuffix {
    static int[] suffix(int[] arr){
        int n=arr.length;
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={2,5,6,1,3};

        int[] ans=suffix(arr);
        System.out.println(ans);

    }
}
