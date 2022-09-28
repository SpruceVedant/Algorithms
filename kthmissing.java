// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 0;
        int j = 1;
        while (count < k) {
            if (i < arr.length && arr[i] == j) {
                i++;
            } else {
                count++;
            }
            j++;
        }
        return j - 1;
        
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(s.findKthPositive(arr, k));
    }
}
