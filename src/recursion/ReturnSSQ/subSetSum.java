package recursion.ReturnSSQ;

public class subSetSum {

    static void subsetSum(int[] a, int n, int idx, int sum){
        if(idx>=n){
            System.out.print(sum);
            return;
        }

        //curr idx + sum;
        subsetSum(a, n, idx+1, sum+a[idx]); //include

        //curr ans;
        subsetSum(a, n, idx+1, sum); //exclude
    }
    public static void main(String[] args) {

        int [] arr={2,3,4};
        int n=arr.length;
        subsetSum(arr, n, 0, 0);


    }
}
