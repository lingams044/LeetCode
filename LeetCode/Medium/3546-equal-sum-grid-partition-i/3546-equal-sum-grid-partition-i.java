class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        long totalsum=0;
    
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              totalsum+=grid[i][j];
            }
        }
        long hsum=0;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++){
              hsum+=grid[i][j];
            }
            if(hsum*2==totalsum){
                return true;
            }
        
        long vsum=0;
        for(int j=0;j<c-1;j++){
            for(i=0;i<r;i++){
              vsum+=grid[i][j];
            }
            if(vsum*2==totalsum){
                return true;
            }
        }
        }

        
    return false;
    }
}