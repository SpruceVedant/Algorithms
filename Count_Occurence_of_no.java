// Count occurrences of a number in a sorted array with duplicates
// Binary search problem

public class count {
    public int count_occur(int[] arr, int target){
        int count = 0;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                count++;
                start = mid + 1;
            }else if(arr[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 8;
        count count = new count();
        count.count_occur(arr, target);
        System.out.println(count.count_occur(arr, target));
    }
}
