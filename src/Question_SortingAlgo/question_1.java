package Question_SortingAlgo;

//Given an array where all its elements are sorted in increasing order except two swapped elements
//sorted it in linear time, Assume there are not duplicate in an array;
public class question_1 {
    static void sortArray(int[]arr){
        int n=arr.length;
        int x=-1, y=-1;
        if(n<=1) return; //check edgecase, corner cases

        //process all the adjacent element;
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){//first conflict
                    x=i-1;
                    y=i;
                }
                else{ //second conflict;
                    y=i;

                }
            }
        }
        //swap x, y in num;
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[]arr={10,5,6,7,8,9,3};
        sortArray(arr);
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
}
