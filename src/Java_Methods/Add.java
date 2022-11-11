package Java_Methods;

import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans=a+b;
        return ans;
    }
}
public class Add {
    public static void main(String[] args) {
        Algebra alg=new Algebra();
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Sum of input number is ");
        int and=alg.add(a,b);
        System.out.println(and);

    }
}
