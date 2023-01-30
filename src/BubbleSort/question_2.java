package BubbleSort;

public class question_2 {
    public static void main(String[] args) {
        String[] fruits={"kiwi","papaya","apple"};
        int n=fruits.length;
        for(int i=0; i<n-1; i++){
            int min_value=i;
            for(int j=i+1; i<n; i++){
                if(fruits[j].compareTo(fruits[min_value])<0){
                    min_value=j;
                }
            }
            //swap
            String temp=fruits[i];
            fruits[i]=fruits[min_value];
            fruits[min_value]=temp;

            for(String s:fruits){
                System.out.print(s + " ");
            }
        }
    }
}
