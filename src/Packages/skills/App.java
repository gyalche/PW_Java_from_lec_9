package Packages.skills;

public class App {
    public String str_1="I am a dawa don";
    void printFromClass(){
        System.out.println("Within class" + str_1);
    }
    public static void main(String[] args) {

        App obj=new App();
        obj.printFromClass();
        App2 obj2=new App2();

    }

}

class App2{
    void printFromOutsideClass(){
        App obj=new App();
        System.out.println("without pacakges but access outside class ");
    }
}