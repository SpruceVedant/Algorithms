// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

// In case of multiple subarrays, return the subarray which comes first on moving from left to right.

class maxsubarraywithsum{
    public int[] maxarraySum(int[] arr,int s,int n){
        int[] result = new int[2];
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            end = i;
            if (sum == s) {
                result[0] = start;
                result[1] = end;
                return result;
            }
            if (sum > s) {
                while (sum > s) {
                    sum -= arr[start];
                    start++;
                }
                if (sum == s) {
                    result[0] = start;
                    result[1] = end;
                    return result;
                }
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
    public static void main(String[] args) {
        maxsubarraywithsum m = new maxsubarraywithsum();
        int[] arr = {1,2,3,7,5};
        int[] result = m.maxarraySum(arr, 12, 5);
        System.out.println(result[0] + " " + result[1]);
    }
}
