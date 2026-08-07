class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int f=0;
        for(int val:nums){
            if(min>val){
                min=val;
            }
            if(max<val){
                max=val;
            }
        }
        for(int i=min;i<=max;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    f=1;
                    break;
                }
            }
            if(f!=1){
               l.add(i);
            }
            f=0;
        }
        return l;
    }
}