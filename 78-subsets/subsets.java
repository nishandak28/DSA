class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        set(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public void set(List<List<Integer>> res, List<Integer> li, int[] nums, int s) {
        res.add(new ArrayList<>(li));

        for(int i = s; i < nums.length; i++) {
            li.add(nums[i]);
            set(res, li, nums, i+1);
            li.remove(li.size()-1);
        }
    }
}