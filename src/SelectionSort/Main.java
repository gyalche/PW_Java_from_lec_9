package SelectionSort;

public class Main {
    static void selectionSort(int[] arr){
        int n=arr.length-1;
        for(int i=0; i<n; i++ ){
            //min_index;
            int min_index=i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            //swap;
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
