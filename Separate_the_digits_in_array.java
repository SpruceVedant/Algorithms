// Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.

// To separate the digits of an integer is to get all the digits it has in the same order.

// For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].


class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> digits = new ArrayList<>();

        for(int num : nums){
            while(num > 0){
                digits.add(num % 10);
                num /= 10;
            }
        }
         Collections.reverse(digits);
        int answer[] = new int[digits.size()];
        for(int i=0;i<digits.size();i++){
           answer[i] = digits.get(digits.size() - i - 1);
        }
        return answer;
    }
}
