package BinarySearch;

//Find the square root of the given non integer value x. Round it off to the nearest floor integer value;
//Input x=4;
//Output=2;

//Input x=11;
//Output=3;

public class question2 {

    static int sqrt(int x){
        int st=0, end=x;
        int ans=-1;

        while(st<=end){
            int mid=st + (end-st)/2;
            int val=mid * mid;
            if(val==x){
                return mid;
            }else if(val<x){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=24;
        System.out.println(sqrt(x));
    }
}
