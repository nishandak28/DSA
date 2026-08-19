class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        permutation(nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    public void permutation(int[] nums, List<Integer> li, boolean[] arr) {

        if(li.size() == nums.length) {
            result.add(new ArrayList<>(li));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!arr[i]) {
                li.add(nums[i]);
                arr[i] = true;
                permutation(nums, li, arr);
                arr[i] = false;
                li.remove(li.size()-1);
            }
        }
    }
}