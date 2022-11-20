package SolvingArrayProblem.ProblemSolvingArray;


//given 2 integer a and b. swap the given values using  temporary variables.
public class Swap {
    static void swap(int a, int b){
        System.out.println("Original value before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println(" value after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
    static void swapWithSumAndDifference(int a, int b){
        System.out.println("Original value before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(" value after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int [] arr={1,2,3,4,5};
        swap(a,b);

        swapWithSumAndDifference(a,b);

    }
}
