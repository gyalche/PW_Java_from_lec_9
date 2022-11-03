import java.util.Scanner;

public class Reverse_number {
    public static <String> void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int reversedNum=0;
        while(n>0){
            reversedNum= reversedNum * 10 + n%10;
            n/=10;
        }

        System.out.println("Revered ans " + reversedNum);
    }
}
