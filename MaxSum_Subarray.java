class subarray_sum{
    public int max_sum(int[] nums){
        int sum = nums[i];
        int max_sum = nums[i];

        for(int i = 1;i<nums.length;i++){
            if(sum < 0){
                sum = 0;
            }

            sum += nums[i];
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
}