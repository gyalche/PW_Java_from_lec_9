package Array;


//Calculate the  sum of all the lements in the given array;
//input:arr[]={1,5,3}
//output:9;
public class Try {

    public static void main(String[] args) {
        int ans=0;
        int [] cal={1,5,3};
        for(int i=0; i<cal.length; i++){
            ans=ans+cal[i];

        }
        System.out.println(ans);

    }
}
