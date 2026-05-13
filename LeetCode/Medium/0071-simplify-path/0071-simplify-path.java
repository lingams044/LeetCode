class Solution {
    public String simplifyPath(String path) {
        String[] sp=path.split("/+");
        Stack<String> st=new Stack<>();
        StringBuilder res = new StringBuilder();
        for(String str:sp){
            if(str.equals(".") || str.isEmpty()){
                continue;
            }
            if(str.equals("..")){
                if(!st.isEmpty()){
                   st.pop();
                }
            }
            else{
                st.push(str);
            }

        }
        for(String s:st){
            res.append("/").append(s);
        }
        return res.length()==0?"/":res.toString();

        
    }
}