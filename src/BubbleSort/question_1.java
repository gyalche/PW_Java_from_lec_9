package BubbleSort;


//Input: 050432;
//Output:534200;

public class question_1 {
    public static void main(String[] args) {
        int[] arr={0,5,0,3,4,2};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    //swap;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
