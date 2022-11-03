import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int facrotial=1;

        for(int i=1; i<=n; i++){
            facrotial=facrotial *i;
            System.out.println(facrotial);


        }


    }
}
