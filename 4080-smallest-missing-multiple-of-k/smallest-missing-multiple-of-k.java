class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hm = new HashSet<>();
        for(int a : nums) {
            hm.add(a);
        }

        int n = 1;
        while(true) {
            if(!hm.contains(k * n))
            {   return k*n;
            }
            n++;
        }
    }
}