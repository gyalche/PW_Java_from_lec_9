package MethodCalls_ScopeVariable;

public class PassByValueAndReference {
    static void changeValue(int a){
        a*=100;
        System.out.println("Inside change value " + a);
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before chaning value" + a);
        changeValue(a);
        System.out.println("After changing value " + a);
    }
}
