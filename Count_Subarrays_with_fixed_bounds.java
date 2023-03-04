class Solution {
    public int numSubarrayBoundedMax(int[] nums, int minK, int maxK) {
        int count = 0, left = -1, right = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxK) {
                left = i;
                right = i;
            } else if (nums[i] >= minK && nums[i] <= maxK) {
                right = i;
                count += right - left;
            } else if (nums[i] < minK) {
                count += right - left;
            }
        }
        return count;
    }
}
