package MultiArray.ProblemSolving;

import java.util.Scanner;

//Given an integer n, return the first n rows of Pascals triangle. In pascals traingle,
//each number is the sum of the two numbers directly given it as shown
public class PascalTraingle {

    static void printMatrix(int[][] matrix){
        int n=matrix.length;
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int[][] ans=new int[n][];
        for(int i=0; i<n; i++){
            //ith row has i+1columns;
            ans[i]=new int[i+1];
            //1st and last element of every row is 1;
            ans[i][0]=ans[i][i]=1;

            for(int j=1; j<i; j++){
                ans[i][j]=ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();

        int[][] ans= pascal(n);
        printMatrix(ans);

    }
}
