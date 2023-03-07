package BinarySearch.Search_2D;

public class search_2d {

    static boolean searchMatrix(int a[][], int target){
        //number of rows=n, number of cols=n;
        int n=a.length, m=a[0].length;

        int st=0, end= n * m -1;
        while(st<=end){
            int mid= st + (end-st)/2;
            int midElt=a[mid/m][mid%m];
            if(midElt==target) return true;
            if(target < midElt){
                end=mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
