package SolvingArrayProblem.ArrayManipulation;

//Find the unique number in a given array where all the elements are being
//repeated twice with one value being unique;

public class UniqueNumber {

    static int findUnique(int[] arr){
        int ans=0;
        int n=arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=i;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int [] arr={1,2,3,4,3,2,1};
        System.out.println("Unique element: " + findUnique(arr));
    }
}
