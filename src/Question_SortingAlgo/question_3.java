package Question_SortingAlgo;

//Given an array of size N containing only 0s, 1s and 2s; Sort array in ascending order;
//Input: N=6;
//arr[]={0,2,1,2,0,0}
//Output=00122;

public class question_3 {
    static void display(int[]arr){
        for(int a:arr){
            System.out.println(a + " ");
        }
        System.out.println();
    }
    static void swap(int[]arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void sort012(int[]arr){
        int lo=0, mid=0, hi=arr.length-1;
        //explore unknown region
        while(mid<=0){
            if(arr[mid]==0){
                swap(arr, mid, lo);
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, hi);
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={0,2,1,2,0,0};
        sort012(arr);
        display(arr);

    }
}
