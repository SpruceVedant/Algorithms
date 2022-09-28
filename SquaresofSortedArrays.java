// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
class Solution {
    public int[] sortedSquares(int[] nums) {
         int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return result;
    }
}








// import java.util.Arrays;

// // Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
// class dfsdf {
//     public int[] sortedSquares(int[] nums) {
//         int[] result = new int[nums.length];
//         for(int i = 0; i < nums.length; i++) {
//             result[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(result);
//         return result;
        
//     }
//     public static void main(String[] args) {
//         dfsdf s = new dfsdf();
//         int[] nums = {-4,-1,0,3,10};
//         int[] result = s.sortedSquares(nums);
//         for (int i = 0; i < result.length; i++) {
//             System.out.println(result[i]);
//         }
//     }
// }
