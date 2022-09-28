// Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

// Note that the letters wrap around.

// For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
        
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(s.nextGreatestLetter(letters, target));
    }
}
