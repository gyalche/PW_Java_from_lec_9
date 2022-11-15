package Array;

class ArrayExample{
    void demoArray(){
        int[] ages=new int[3];
        float[] weights=new float[3];
//        String[] names=new String[3];
        String[] names={"Dawa", "Kancha", "Jora"};
        ages[0]=24;
        ages[1]=12;
        ages[2]=19;

        System.out.println( ages[0]);
        System.out.println( ages[1]);
        System.out.println( ages[2]);

        System.out.println( names[0]);
        System.out.println( names[1]);
        System.out.println( names[2]);

    }

    void multiArrays(){
        int[][] array1=new int[5][3];
        //or you can write this way;
        int[][] arr={{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(arr[0][1]);//2
        System.out.println(arr[0][2]);//3

        //3D array;
        int [][][] arr_3=new int[5][3][2];
        arr_3[0][0][0]=1;

    }
}
public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
        obj.multiArrays();
    }
}
