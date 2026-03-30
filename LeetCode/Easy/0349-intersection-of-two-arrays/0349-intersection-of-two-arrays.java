class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        Set<Integer> res= new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(Integer var:set1){
            if(set2.contains(var)){
                res.add(var);
            }
        }
        int[] arr = new int[res.size()];
        int j=0;
        for(Integer val:res){
            arr[j]=val.intValue();
            j++;
        }
        return arr;
        
    }
}