package Array;


import java.util.Arrays;
import java.util.Scanner;

//Count the number of  occurance of a particular element in array
public class Questions {

    static int countOccurance(int[] arr, int x){
       int count=0;
       for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
       }
       return count;
    }
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=1;

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        System.out.println("Coun of x " + countOccurance(arr, x));

        //To sort an array
//        Arrays.sort()


    }
}
