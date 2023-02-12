package Question_SortingAlgo;

//Given an array of positive and negative integers, seperate them in a linear time and constant space,
//The output should print all the negative number followed by positive number;
public class question_2 {
    static void display(int[]arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void parition(int[]arr){
        int l=0;
        int r=arr.length-1;

        while(l<r){
            while(arr[l]<0)l++;
            while(arr[r]>=0)r--;

            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={19,-20,7,-4,-13,11,-5,3};
        parition(arr);
        display(arr);
    }
}
