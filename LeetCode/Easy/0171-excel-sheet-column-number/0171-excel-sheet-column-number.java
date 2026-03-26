class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans=0;
        if(n==1){
            ans = columnTitle.charAt(0)-'A'+1;
        }
        if(n==2){
            ans=26*(columnTitle.charAt(0)-'A'+1)+columnTitle.charAt(1)-'A'+1;
        }
        for(int i=0;i<n;i++){
            ans*=26*(columnTitle.charAt(i)-'A');
        }

        return ans;
        
    }
}