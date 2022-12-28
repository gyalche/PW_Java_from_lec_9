package recursion;

public class findSum {
    static int sum(int n){
       //base case;
        if(n>=0 && n<=9) return n;

        //recursive work->small ans;
        int smallAns=sum(n/10);

        //self work;
        return smallAns + n%10;


    }
    public static void main(String[] args) {
        int n=5123;
        System.out.println("Sum is" + sum(n));
    }
}
