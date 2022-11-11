import Packages.skills.App;

public class OutsidePWSkills {
    public static void main(String[] args) {
        App obj= new App();
        System.out.println("outisde" + obj.str_1);

        App3 obj3=new App3();

    }


class App3 extends App{
    void printFromChildClass(){
        App3 obj3=new App3();
        System.out.println("child class" + obj3.str_1);
    }
}
