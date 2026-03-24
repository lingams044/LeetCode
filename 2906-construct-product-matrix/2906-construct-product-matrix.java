class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int Mod = 12345;
        int r = grid.length;
        int c = grid[0].length;
        int[][] p = new int[r][c];
        long suffix=1;
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                p[i][j]=(int) suffix;
                suffix=(suffix*grid[i][j])%Mod;
            }
        }
        long prefix=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                p[i][j]=(int) (((long) p[i][j]*prefix)%Mod);
                prefix=(prefix*grid[i][j])%Mod;
            }
        }
        return p;
    }
}