/* Print Matrix in snake Pattern -> Problem : "https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1"

Given a matrix mat[][] of size n x n. Print the elements of the matrix in the snake like pattern depicted below.


Examples :

Input: n = 3, mat[][] = [[45, 48, 54], 
                         [21, 89, 87], 
                         [70, 78, 15]]
Output: [45, 48, 54, 87, 89, 21, 70, 78, 15] 
Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15] 

Input: n = 2, mat[][] = [[1, 2], 
                         [3, 4]]
Output: [1, 2, 4, 3] 
Explanation: Printing it in snake pattern will give output as [1, 2, 4, 3]

Constraints:
1 <= n <= 103
1 <= mat[i][j] <= 109 */



class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
   
        ArrayList<Integer> arr= new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i=0; i<rows; i++) {
            if (i%2 == 0) {
                for (int j=0; j<cols; j++) {
                   arr.add(matrix[i][j]); 
                }
                
            } else {
                for (int j=cols-1; j>=0; j--) {
                    arr.add(matrix[i][j]);
                }
            }
        }
        return arr;
    }
}


//  Time Complexity: O(n²)

//  Space Complexity: O(n²)