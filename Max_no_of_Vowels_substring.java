// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

// Example 1:

// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.
// Example 2:

// Input: s = "aeiou", k = 2
// Output: 2
// Explanation: Any substring of length 2 contains 2 vowels.
// Example 3:

// Input: s = "leetcode", k = 3
// Output: 2
// Explanation: "lee", "eet" and "ode" contain 2 vowels.


class Solution {
    public int maxVowels(String s, int k) {
     int max_vowels = 0;
     int vowels = 0;
     int start = 0;

     for(int i=0;i<s.length();i++){
         char c = s.charAt(i);
         if(isVowel(c)){
             vowels++;
         }
         if(i - start+1 > k){
             char startChar = s.charAt(start);
             if(isVowel(startChar)){
                 vowels--;
             }
             start++;
         }
          max_vowels = Math.max(max_vowels,vowels);
     }   
     return max_vowels;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
