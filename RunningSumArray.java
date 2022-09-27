class running{
    public int runningSum(int nums[]){
        int res = new int[nums.lentgh];
        for(int i=0;i<nums.length;i++){
            if(i == 0){
                res[i] = nums[i];
            }
            else{
                res[i] = nums[i] + res[i-1];
            }
        }
        return res;
    }
}