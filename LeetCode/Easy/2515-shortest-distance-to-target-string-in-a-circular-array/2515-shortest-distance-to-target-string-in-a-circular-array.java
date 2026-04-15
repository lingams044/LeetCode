class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {  
        int n = words.length;
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                found=true;
            
            int dirdis = Math.abs(i-startIndex);
            int anotherdis = n-dirdis;
            int shortdis = Math.min(dirdis,anotherdis);
            min=Math.min(min,shortdis);
            }
        }

       return found?min:-1;
    }
}