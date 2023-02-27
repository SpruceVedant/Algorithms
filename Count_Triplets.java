package Arrays;

import java.util.Arrays;

public class Count_Triplets {
    public static void main(String[] args) {
        int n = 4;
        int[] arr ={1,5,3,2};
        int count = 0;
       Arrays.sort(arr);
       for (int i = n-1; i >= 2; i--) {
        int left = 0,right = i - 1;
        while(left < right){
            if(arr[left] + arr[right] == arr[i]){
                count++;
                right--;
            } else if(arr[left] + arr[right] < arr[i]){
                left++;
            } else{
                right--;
            }
        }
       }
       System.out.println(count);
    }
}
