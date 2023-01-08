package recursion.Array;

public class printMaxValue {
    static int printMax(int[] arr, int indx){
        //base case
        if(indx==arr.length-1){
            return arr[indx];
        }

        //indx+1, end of the array ->max->recursion
        int smallAns=printMax(arr, indx+1);

        //self work;
        return Math.max(arr[indx], smallAns);


    }
    public static void main(String[] args) {
        int [] arr={3,10,3,12,5};

        System.out.println(printMax(arr, 0));

    }
}
