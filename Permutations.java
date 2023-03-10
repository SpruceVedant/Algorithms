// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        boolean[] used = new boolean[nums.length];
        List<Integer> current = new ArrayList<>();
        permuteHelper(nums, used, current, result);
        return result;
    }

    private void permuteHelper(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                permuteHelper(nums, used, current, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}
