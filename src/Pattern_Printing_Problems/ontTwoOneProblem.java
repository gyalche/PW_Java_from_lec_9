package Pattern_Printing_Problems;

import java.util.Scanner;
//12121212
//21212121
//12121212
//21212121
public class ontTwoOneProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
