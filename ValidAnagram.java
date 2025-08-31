// 242. Valid Anagram

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false

// Constraints:
// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (int ch : t.toCharArray()) {
            count[ch - 'a']--;
        }
        for (int i=0; i<26; i++) {
            if (count[i] != 0)
            return false;
        }

        return true;
    }
}


/* another approach (single loop → add & subtract together):

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int n : count) {
            if (n != 0)
            return false;
        }

        return true;
    }
}
*/