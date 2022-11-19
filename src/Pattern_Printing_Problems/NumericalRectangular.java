package Pattern_Printing_Problems;

import java.util.Scanner;
//        12345
//        23451
//        34512
//        45123
//        51234
public class NumericalRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=i; j<=r; j++ ){
                System.out.print(j);
            }
            for(int k=1; k<=i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
