class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> findDuplicates(int[] nums) {
        int index = 0;
        int num = 0;
        for(int i = 0; i < nums.length;i++) {
            num = Math.abs(nums[i]);
            index = num-1;

            if(nums[index] < 0)arr.add(num);
            else{
                nums[index] = -1 * nums[index];
            } 
        }

        return arr;
    }
}