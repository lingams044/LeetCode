class Solution {
    public String digitSum(String s, int k) {
        String ans="";
        while(s.length()>k){
            for(int i=0;i<s.length();i+=k){
                int sum=0;
                for(int j=i;j<i+k && j<s.length();j++){
                    sum+=s.charAt(j)-'0';
                }
                ans+=sum;
            }
            s=ans;
            ans="";
        }
        return s;
    }
}