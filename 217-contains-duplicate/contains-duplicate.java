class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int a: nums) {
            if(hs.contains(a)) return true;
            hs.add(a);
        }
        return false;
    }
}