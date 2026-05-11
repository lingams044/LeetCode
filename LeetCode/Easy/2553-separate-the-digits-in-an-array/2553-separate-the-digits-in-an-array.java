class Solution {
    public int[] separateDigits(int[] nums) {
        int c=0;
        String str="";
        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                str+=s.charAt(j);
            }
        }
        int n = str.length();
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i]=str.charAt(i)-'0';
        }
        return result;
    }
}