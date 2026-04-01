class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int res = -1;
        for(int k=l;k<=r;k++){
            for(int i=0;i<=n-k;i++){
                int sum=0;
                for(int j=i;j<i+k;j++){
                    sum+=nums.get(j);
                }
                if(sum>0){
                    if(res==-1 || res>sum){
                        res=sum;
                    } 
                }
            }
        }
        return res;
    }
}