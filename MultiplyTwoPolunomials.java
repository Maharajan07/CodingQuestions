/* Multiply two polynomials -> Problem : "https://www.geeksforgeeks.org/problems/multiply-two-polynomals0721/1"

You are given two polynomials represented by two arrays, a[] and b[] where each index of the array corresponds to the exponent of the variable(e.g. x), and the value at that index represents the coefficient of the term.
For example, A[] = [a, b, c, d] represents the polynomial a + b* x1 + c* x2 + d* x3
and B[] = [a1, b1, c1] represents the polynomial a1 + b1* x1 + c1* x2
Your task is to compute the product of these two polynomials and return the resulting polynomial in the same array-based format.


Examples:

Input: A[] = [5, 0, 10, 6], B[] = [1, 2, 4]
Output: [5, 10, 30, 26, 52, 24]
Explaination:
First polynomial: 5 + 0x1 + 10x2 + 6x3
Second polynomial: 1 + 2x1 + 4x2
Product polynomial: 5 + 10x1 + 30x2 + 26x3 + 52x4 + 24x5

Input: A[] = [1, 9, 3, 4, 7], B[] = [4, 0, 2, 5]
Output: [4, 36, 14, 39, 79, 23, 34, 35]
Explaination:
First polynomial: 1 + 9x1 + 3x2 + 4x3 + 7x4
Second polynomial: 4 + 0x1 + 2x2 + 5x3
Product polynomial: 4 + 36x1 + 14x2 + 39x3 + 79x4 + 23x5 + 34x6 + 35x7

Constraints:
1 ≤ a.size(), b.size() ≤ 103
0 ≤ a[i], b[i] ≤ 100 */


class MultiplyTwoPolynomial {
    public int[] multiply(int[] A, int[] B) {
        
        int M = A.length;
        int N = B.length;
        int[] res = new int[M+N-1];
        
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                res[i+j] += A[i]*B[j];
            }
        }
        return res;
    }
}

// Time Complexity : O(M × N)
// Space Complexity : O(M + N)