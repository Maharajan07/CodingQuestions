/* Sum of numbers in string -> Problem : "https://www.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1"

Given a string s containing alphanumeric characters. You have to calculate the sum of all the numbers present in the string.

Examples:
Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.

Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.

Constraints:
1 ≤ |s|≤ 105
The sum of Numbers ≤ 105 */


class SumNumbers {
    public int findSum(String s) {
        int num = 0;
        int sum = 0;
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                int n = ch - '0';
                num = (num * 10) + n;
            } else {
                sum += num;
                num =0;
            }
        }
        sum += num;
        return sum;
    }
}


// Time Complexity : O(n)

// Space Complexity : O(1)