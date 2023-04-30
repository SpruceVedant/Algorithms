class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];
        // int initial_count = 0;
        
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i;j<nums.length;j++){
        //         while( j != i){
        //             if(nums[j] < nums[i]){
        //                 intial_count++;
                        
        //             }
        //         }
        //     }
        // }
        for(int i=0;i<nums.length;i++){
            int count = 0;
           for(int j=0;j<nums.length;j++){
               if(j!=i && nums[j] < nums[i]){
                   count++;
               }
               res[i] = count;
           }
        }
        return res;
        
    }
}
