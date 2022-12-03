package MultiArray.Problem2;

import java.util.Scanner;

public class SpiralOrder {
    static  void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        while(){
            //top row -> leftCol to rightCol
                for(int j=0; j<=rightCol; j++){
                    System.out.print(matrix[topRow][j] + " ");
                }
            //right col -> topRow to  BottomRow
                for(int i=topRow; i<=bottomRow; i++){
                    System.out.print(matrix[i][rightCol]);
                }

            //bottomRow -> rightCol to leftCol
                for(int j=rightCol; j>=leftCol; j--){
                    System.out.print(matrix[bottomRow][j]);
                }

            //leftCol -> bottomRow to topRow
                for(int i=bottomRow; i>=topRow; i--){
                    System.out.print(matrix[i][leftCol]);
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int total=r*c;
        System.out.println("Enter " + total + " values");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Spiral Order");
        printSpiralOrder(matrix, r, c);
    }
}
