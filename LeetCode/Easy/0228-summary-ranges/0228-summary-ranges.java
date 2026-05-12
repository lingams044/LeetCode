class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        if(n==0){
            return list;
        }
       //  c=nums[0];
        int s,e,c;
        for(int i=0;i<n;){
            s=nums[i];
            c=nums[i];
            while(i<n && c==nums[i]){
                c++;
                i++;
            }
            e=nums[i-1];
            if(s!=e){
                list.add(s+"->"+e);
            }
            else{
                list.add(String.valueOf(s));
            }

        }
        return list;
        
    }
}