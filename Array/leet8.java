/*
867. Transpose Matrix

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
*/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int[][] ans =new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}