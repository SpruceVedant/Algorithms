class shuffle{
    public int shufflearray(int nums[],int n){
        int res[] = new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i] = res[i];
            res[2*i+1] = res[n+1];
        }
        return res;
    }
}

// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//       return IntStream.range(0, n)
//             .flatMap(i -> IntStream.of(nums[i], nums[i + n]))
//             .toArray();

//     }
// }
