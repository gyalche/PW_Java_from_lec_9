package MergeSort;

public class mergeSort {
    static void displayArr(int[]arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
    }

    static void merge(int[]arr, int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        int i,j,k;
        for(i=0; i<n1; i++) left[i]=arr[i+1];
        for(j=0;j<n2;j++)right[j]=arr[j+1];

        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergesort(int[] arr, int l, int r){
        //base case;
        if(l>=r)return;
        //mid;
        int mid=(l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int [] arr={4,1,3,5,2};
        int n=arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        mergesort(arr, 0, n-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
