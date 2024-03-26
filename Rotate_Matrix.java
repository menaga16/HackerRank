class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int t=0;
                t=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=t;
            }
        }  
        
    }
}


output:

Input
matrix =
[[1,2,3],[4,5,6],[7,8,9]]
Output
[[7,4,1],[8,5,2],[9,6,3]]
Expected
[[7,4,1],[8,5,2],[9,6,3]]
