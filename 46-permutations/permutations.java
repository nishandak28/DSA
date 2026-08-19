class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        permutation(nums, new ArrayList<>(), new HashSet<>());
        return result;
    }

    public void permutation(int[] nums, List<Integer> li, HashSet<Integer> hs) {

        if(li.size() == nums.length) {
            result.add(new ArrayList<>(li));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!hs.contains(i)) {
                li.add(nums[i]);
                hs.add(i);
                permutation(nums, li, hs);
                hs.remove(i);
                li.remove(li.size()-1);
            }
        }
    }
}