// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.
// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
 

// Constraints:

// 1 <= ransomNote.length, magazine.length <= 105
// ransomNote and magazine consist of lowercase English letters.

package EASY;

public class Ransom_Note {
    public boolean canConstruct(String RansomNote, String Magzine) {
        if (RansomNote.length() > Magzine.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char c : Magzine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : RansomNote.toCharArray()) {
            if (count[c - 'a'] == 0)
                return false;

            count[c - 'a']--;

        }

        return true;

    }
}
