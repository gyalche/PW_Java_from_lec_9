package MultiArray.ProblemSolving;

import java.util.Scanner;
//given a square matrix, turn it by 90 degree in a clock wise direction without using an extra space
public class RotationMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][]matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    static void reverseArray(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;
        }
    }
    static void rotate(int[][] matrix, int n){
        //transpose
        transposeInPlace(matrix, n, n);
        //reverse each row of transposed matrix;
        for(int i=0; i<n; i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number  of rows and  column of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][] matrix=new int[r][c];
        int totalElement=r*c;

        System.out.println("Enter "+ totalElement +" values");
        for(int i=0; i<r; i++){
            for( int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        rotate(matrix, r);
        System.out.println("Rotation of Matrix");
        printMatrix(matrix);




    }

}
