class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hash1 = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            hash1.put(ransomNote.charAt(i),hash1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
         HashMap<Character,Integer> hash2 = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            hash2.put(magazine.charAt(i),hash2.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(Character key:hash1.keySet()){
            if(hash2.getOrDefault(key,0)<hash1.get(key)){
                return false;
            }
        }
        return true;
    }
}