package BinarySearch.Search_2D;

public class findPeak {
    static int findPeakElement(int[]a){
        int st=0, end=a.length-1;
        while(st<=end){
            int mid=st + (end-st)/2;
            if((a[mid]>a[mid-1]) && a[mid]>a[mid+1]){
                return mid;
            }
            if(a[mid]<a[mid+1]){ //uphill / ascending
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
