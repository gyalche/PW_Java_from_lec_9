package QuickSort;

public class quickSort {

    static void displayArr(int[] arr){
        for(int a:arr){
            System.out.println(a + " ");
        }
    }
    static void  swap(int[]arr, int x, int y){
    int temp=arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
    }
    static int parition(int[]arr, int start, int end){
        int pvt=arr[start];
        int cnt=0;
        for(int i=start+1; i<=end; i++){
            if(arr[i]<=pvt)cnt++;
        }
        int pvtIndex=start+cnt;
        swap(arr, start, pvtIndex);
        int i=start, j=end;
        //element lesser left, greater right side;
        while(i<pvtIndex && j>pvtIndex){
            while(arr[i]<=pvt) i++;
            while(arr[j]>pvt)j--;
            if(i<pvtIndex && j>pvtIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pvtIndex;
    }
    static void quickSort(int[]arr, int start, int end){
        if(start>=end) return;

        //do partition;
        int pi=parition(arr, start, end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);

    }

    
    public static void main(String[] args) {
        int[] arr={6,3,1,5,4};
        System.out.println("Array befor sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array after quickSorting");
        displayArr(arr);
    }
}
