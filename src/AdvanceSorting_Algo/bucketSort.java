package AdvanceSorting_Algo;
import java.util.ArrayList;
import java.util.Collections;
//put all the elements in b no of buckets;
//sort each bucket individually;
//take out all elements and join them
public class bucketSort {

    static void bucketsort(float[]arr){
        int n=arr.length;
        //Bucket;
        ArrayList<Float>[] bucket=new ArrayList[n];
        //create empty bucket;
        for(int i=0; i<n; i++){
            bucket[i]= new ArrayList<Float>();
        }
        //add elemnt into our bucket;
        for(int i=0; i<n; i++){
            int bucketIndex=(int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }
        //sort each bucket individually;
        for(int i=0; i<bucket.length; i++){
            Collections.sort(bucket[i]);
        }
        //merge all the bucket to get final sorted array;
        int index=0;
        for(int i=0; i<bucket.length; i++){
            ArrayList<Float> currBucket=bucket[i];
            for(int j=0; j<currBucket.size(); j++){
                arr[index++]=currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr={0.5f, 0.4f,0.3f,0.2f,0.1f};
        bucketsort(arr);
        for(float f:arr){
            System.out.print(f + " ");
        }
    }
}
