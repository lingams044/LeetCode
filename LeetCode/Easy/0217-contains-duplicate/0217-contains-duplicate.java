class Solution {
    public boolean containsDuplicate(int[] nums) {
       // int n=nums.length;
        HashSet<Integer> set1 = new HashSet<>();
        for(int num:nums){
            //set1.add(nums[i]);
           if(set1.contains(num)){
                return true;
           }
        
         set1.add(num);
           
        }
        return false;
        
    }
}