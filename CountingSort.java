// Counting Sort -> Problem : "https://www.geeksforgeeks.org/problems/counting-sort/1"

// Given a string s consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

// Examples:
// Input: s = "edsab"
// Output: abdes
// Explanation: In lexicographical order, s will be abdes.

// Input: s = "geeksforgeeks"
// Output: eeeefggkkorss
// Explanation:In lexicographical order, s will be eeeefggkkorss.

// Constraints:
// 1 ≤ s.size() ≤ 105



class Solution {
    public static String countSort(String s) {

        int[] count = new int[26];
        
        for (int i=0; i<s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            count[temp]++;
        }
        
        StringBuilder res = new StringBuilder();
        for (int i=0; i<26; i++) {
            for (int j=0; j<count[i]; j++) {
                res.append((char)(i+ 'a'));
            }
        }
        return res.toString();
    }
}


// Time Complexity: O(n)
// Space Complexity: O(n)