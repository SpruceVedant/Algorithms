class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];//max is the max sum of the subarray so far  and it is initialized to the first element of the array
        int sum = 0;
        for(int i = 0; i < nums.length; i++){//iterate through the array
            sum += nums[i];//add the current element to the sum 
            if(sum > max){//if the sum is greater than the max then update the max
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
        
    }
}
