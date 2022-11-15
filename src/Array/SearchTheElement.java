package Array;

import java.util.Scanner;

public class SearchTheElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        int ans=-1;
        int[] arr={1,5,3};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==find){
                ans=i;

                break;
            }

        }
        System.out.println("the search  ans index is " + ans);
    }
}
