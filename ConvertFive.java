/* Replace all 0's with 5 -> Problem : "https://www.geeksforgeeks.org/problems/replace-all-0-with-5-in-an-input-integer/1"

Given a number N. The task is to complete the function convertFive() which replaces all zeros in the number with 5 and returns the number.

Example:

Input
2
1004
121

Output
1554
121

Explanation:
Testcase 1:  At index 1 and 2 there is 0 so we replace it with 5.
Testcase 2: There is no,0 so output will remain the same.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow.
Each test case contains a single integer N denoting the number.

Output:
The function will return an integer where all zero's are converted to 5.

Your Task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function convertFive().

Constraints:
1 <= T <= 103
1 <= N <= 104 */


class ConvertFive {
    public static int convertFive(int n) {
        int ans = 0;
        
        if (n == 0)
            return 5;
            
        int fact = 1;
        
        while (n>0) {
            if (n%10 == 0)
                ans += (5*fact);
            else
                ans += (n%10 * fact);
                
            n = n/10;
            fact *= 10;
        }
        
        return ans;
    }
}


// Time Complexity : O(d) where d is number of digits in n

// Space Complexity : O(1)