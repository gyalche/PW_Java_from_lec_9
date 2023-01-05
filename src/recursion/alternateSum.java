package recursion;
//Q: Given a number n, find the sum of natural number till n but with a alternate sign;
// that means if n=5, you will have to return 1-2=3-4=5, ans =3;
//EVEN NUMBER IS SUBTRACTED AND ODD NUMBER IS ADDED;


import java.util.Scanner;

public class alternateSum {
    static int seriesSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriesSum(n-1) - n;
        }
        else{
            return seriesSum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
