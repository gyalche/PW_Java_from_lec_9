import java.util.Scanner;
public class Question {

    //given 2 number a and b. Find a raise to the power b;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        for(int  i=1; i<=b; i++){
            ans *=a;
        }
        System.out.println(ans);
    }
}
