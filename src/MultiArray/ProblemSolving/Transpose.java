package MultiArray.ProblemSolving;

import java.util.Scanner;

public class Transpose {

    static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][]matrix, int r, int c){
        int[][] transpose=new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
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

        System.out.println("Transpose of Matrix");
        int[][] ans=findTranspose(matrix, r, c);
        printMatrix(ans);


    }
}
