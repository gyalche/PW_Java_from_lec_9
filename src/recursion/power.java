package recursion;

public class power {
    static int pow(int p, int q){
        //base case;
        if(q==0) return 1;
        return pow(p, q-1) * p;
    }
    public static void main(String[] args) {
        int p=2;
        int q=2;
        System.out.println(pow(p,q));
    }
}
