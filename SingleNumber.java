class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
              if(nums[i] != nums[j]){
                  return nums[i];
              }
          }
        }
        return nums[i];
    }
}
