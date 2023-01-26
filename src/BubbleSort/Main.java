package BubbleSort;

public class Main {
    static void bubbleSort(int[] a){
        int n=a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0;j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={7,6,8,4,3};
        bubbleSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }

    }
}
