package MultiArray.Problem2;


import java.util.Scanner;

//Given a positive integer  n, generatge an nxn matrix  filled with elements 1 to n^2 in spiral order
//eg n=3 ans=3*3=9
//output=123
//        894
//        765
public class spiralnxn {
    static void printSpiral(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int[][] matrix, int r, int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElement=0;
        while(totalElement<r*c){
            //topRow=>leftCol to right Col
            for(int j=leftCol; j<=rightCol && totalElement<r*c; j++){
                System.out.print(matrix[topRow][j]);
                totalElement++;
            }
            topRow++;

            //RightCol=>topRow to bottomRow
            for(int i=topRow; i<=bottomRow; i++){
                System.out.println(matrix[topRow][rightCol]);
                totalElement++;
            }
            rightCol--;

            //BottomRow=>rightCol to leftCol;
            for(int i=rightCol; i<=leftCol; i++){
                System.out.print(matrix[bottomRow][i]);
                totalElement++;
            }
            bottomRow--;

            //LeftCol=>bottomRow  to topRow;
            for(int j=bottomRow; j<=topRow; j++){
                System.out.print(matrix[j][leftCol]);
                totalElement++;
            }
            leftCol++;


        }
    }
    static int[][] spiralSquare( int n){
        int[][] matrix=new int[n][n];
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int curr=1;
        while(curr<=n*n){
            //topRow=>leftCol to rightCol;
            for(int i=leftCol; i<=rightCol && curr<=n*n; i++){
                matrix[topRow][i]=curr++;
            }
            topRow++;

            //rightCol=>topRow to bottomRow;
            for(int i=topRow; i<=bottomRow && curr<=n*n; i++){
                matrix[i][rightCol]=curr++;
            }
            rightCol--;

            //bottomRow=> rightCol to leftCol;
            for(int i=rightCol; i>=leftCol && curr<=n*n; i--){
                matrix[bottomRow][i]=curr++;
            }
            bottomRow--;

            //leftCol=>bottomRow to  topRow;
            for(int i=bottomRow; i>=topRow && curr<=n*n; i--){
                matrix[i][leftCol]=curr++;
            }
            leftCol++;


        }
        return matrix;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[][]ans=spiralSquare(n);
        printSpiral(ans);
//        System.out.println("Enter the number of row and column");
//        int r=sc.nextInt();
//        int c=sc.nextInt();
//
//        int matrix[][]=new int[r][c];
//        int totla=r*c;
//        System.out.println("Enter row and column");
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                matrix[i][j]=sc.nextInt();
//            }
//
//        }
//        System.out.println("Input Matrix");
//        printSpiral(matrix);

    }
}
