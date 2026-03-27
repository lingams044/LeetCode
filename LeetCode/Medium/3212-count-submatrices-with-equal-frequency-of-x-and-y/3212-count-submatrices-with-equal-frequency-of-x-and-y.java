class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] colX = new int[cols];
        int[] colY = new int[cols];
        int totalSubmatrices = 0;

        for (int i=0;i<rows;i++) {
            int rowX = 0;
            int rowY = 0;
            for (int j=0;j<cols;j++) {
                if (grid[i][j] == 'X'){
                     rowX++;
                }
                else if (grid[i][j] == 'Y'){ 
                    rowY++;
                }
                colX[j]+= rowX;
                colY[j]+= rowY;
                if (colX[j]>0 && colX[j] == colY[j]) {
                    totalSubmatrices++;
                }
            }
        }
        return totalSubmatrices;
    }
}
