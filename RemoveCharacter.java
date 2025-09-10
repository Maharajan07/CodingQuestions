/* Remove charactern -> Problem: "https://www.geeksforgeeks.org/problems/remove-character3815/0"

Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters.
NOTE: Size of the first string is always greater than the size of the second string( |str1| > |str2|). 

Example 1:
Input: str1 = "computer", str2= "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t) from string1 we get "ompuer".

Example 2:
Input: str1 = "occurrence", str2 = "car"
Output: "ouene"
Explanation: After removing characters (c, a, r) from string1 we get "ouene".

Constraints:
1 <= |Str1| , |Str2| <= 50 */


class RemoveCharacter {
    static String removeChars(String str1, String str2) {
        boolean[] present = new boolean[26];
        for (int i=0; i<str2.length(); i++) {
            present[str2.charAt(i) - 'a'] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!present[ch -'a'])
                sb.append(ch);
        }
        return sb.toString();
    }
}

// Time Complexity : O(n + m)
// Space Complexity : O(1)