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

        //for each loop;
        for(int age:ages){
            System.out.println(age);
        }

        //while loop;
        int i=0;
        while(i<ages.length){
            System.out.println(ages[i]);
            i+=1;
        }

    }

    void multiArrays(){
        int[][] array1=new int[5][3];
        //or you can write this way;
        int[][] arr={{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(arr[0][1]);//2
        System.out.println(arr[0][2]);//3

        System.out.println("Array length"+ arr.length);
        //3D array;
        int [][][] arr_3=new int[5][3][2];
        arr_3[0][0][0]=1;

        //travesring multi array;
        for(int i=0;  i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
        obj.multiArrays();
    }
}
