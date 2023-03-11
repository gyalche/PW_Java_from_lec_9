package BinarySearch.Search_2D;


//Leedcode 240. Search 2D matrix;
public class question {
    public boolean searchMatrix(int[][]a, int target){
        int n=a.length, m=a[0].length;
        int i=0, j=m-1;
        while(i<n && j>=0){
            if(a[i][j]==target) return true;
            if(target<a[i][j]){
                j--; //move left
            }else{
                i++; //move downwards;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
