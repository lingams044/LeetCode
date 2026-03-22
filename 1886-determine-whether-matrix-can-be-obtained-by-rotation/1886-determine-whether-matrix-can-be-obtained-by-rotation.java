class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int r = mat.length;
        int c = mat[0].length;
        for(int k=0;k<4;k++){
            if(isequal(mat,target,r,c)){
                return true;
            }
           mat = rotate(mat,r,c);
            
            }
        return false;
        }
    
    public static boolean isequal(int[][] mat,int[][] target,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
        
    
    public static int[][] rotate(int mat[][],int r,int c){
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=mat[r-j-1][i];
            }
        }
        return res;
    }
}