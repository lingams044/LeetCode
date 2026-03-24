class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums) {
            sortedSet.add(num);
            if (sortedSet.size() > 3) {
                sortedSet.pollFirst(); 
            }
        }
        return sortedSet.size() == 3 ? sortedSet.first() : sortedSet.last();  
    }
}