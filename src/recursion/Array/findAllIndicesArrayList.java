package recursion.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class findAllIndicesArrayList {
    static ArrayList<Integer> allIncices(int[]arr, int x, int idx){
        //base case
        if(idx>=arr.length){
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> ans= new ArrayList<>();
        //self work;
        if(arr[idx]==x){
            ans.add(idx);
        }

        //recursion
        ArrayList<Integer> smallAns=allIncices(arr, x, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();

        ArrayList<Integer>ans=allIncices(arr, target, 0);
        for(Integer i:ans){
            System.out.println(i);
        }


    }
}
