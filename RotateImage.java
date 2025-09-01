// 48. Rotate Image

// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]

// Example 2:
// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 
// Constraints:
// n == matrix.length == matrix[i].length
// 1 <= n <= 20
// -1000 <= matrix[i][j] <= 1000



class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the 2D Array
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row of the 2D Array
        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        
    }
}

//  Time Complexity: O(n²)

//  Space Complexity: O(1)

/*
Another approach: create a new temp matrix of the same size and place elements in rotated positions.
        This makes Space Complexity O(n²) since we use an extra matrix.

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                temp[j][n-1-i] = matrix[i][j];
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
        
    }
}
*/

/*
for 270 degrees:

class solution {
    public void rotate270(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the 2D Array
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each column of the 2D Array
        for (int j=0; j<n; j++) {
            for (int i=0; i<n/2; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }
    }
}

for 180 degrees:

class solution {
    public void rotate180(int[][] matrix) {
        int n = matrix.length;

        for (int i=0; i<n/2; i++) {
            for (int j=0; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = temp;
            }
        }
        
        // if odd dimension, reverse the middle row
        if (n % 2 == 0) {
            int mid = n/2;
            for (int j=0; j<n/2; j++) {
                int temp = matrix[mid][j];
                matrix[mid][j] = matrix[mid][n-1-j];
                matrix[mid][n-1-j] = temp;
            }
        }
    }
}

To achive any degrees of rotation without changing the loops:

int m = degree / 90;  // how many times to rotate 90°

while (m >= 1) {      // repeat rotation m times
    rotate90(matrix);   // rotate by 90°
    m--;
}

 */