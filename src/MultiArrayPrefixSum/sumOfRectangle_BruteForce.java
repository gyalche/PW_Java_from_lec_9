package MultiArrayPrefixSum;

import java.util.Scanner;
//Given a matrix 'a' of dimension nXm and 2 cordinates(l1,r1) and (l2,r2). Return the sum of rectangle
//from (l1,r1) to (l2,r2).
public class sumOfRectangle_BruteForce {
    static int findSum(int[][] matrix, int l1,  int r1, int l2, int r2){
        int sum=0;

        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    //calculate row-wise and column-wise;
    static void findPrefixSumMatrix(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;

        //traversing horizontally  to calculate row-wise prefix sum matrix;
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        //traverse vertically to calculate column-wise prefix sum;
        for(int j=0; j<c; j++){ //fixing column
            for(int i=1; i<r; i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }

    static int findSum2(int[][] matrix, int l1,  int r1, int l2, int r2){
        int ans=0;
        findPrefixSumMatrix(matrix);
        for(int i=l1; i<=l2; i++){
            //r1 to r2 sum for row i
            if(r1>=1){
                ans+=matrix[i][r2]-matrix[i][r1-1];
            }
            else{
                ans+=matrix[i][r2];
            }
        }
        return ans;
    }

    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans=0, sum=0,up=0, left=0,leftUp=0;
        findPrefixSumMatrix(matrix);

        sum=matrix[l2][r2];
        if(l1>=1){
            up=matrix[l1-1][r2];
        }
        if(r1>=1){
            left=matrix[l2][r1-1];
        }
        if(l1>=1 && r1>=1){
            leftUp=matrix[l1-1][r1-1];
        }
        ans=sum-up-left+leftUp;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows an column");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][] matrix=new int[r][c];
        int totalElement=r*c;

        System.out.println("Enter " + totalElement + " values");

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundries l1 r1 l2 r2");

        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle sum " + findSum(matrix, l1,r1,l2,r2));
        System.out.println("Rectangle sum " + findSum2(matrix, l1,r1,l2,r2));
        System.out.println("Rectangle sum " + findSum3(matrix, l1,r1,l2,r2));

    }
}
