class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length == 1) return arr;
        HashSet<Integer> arr2 = new HashSet<>();
        
        for(int a : nums) {
            if(arr2.contains(a))arr.add(a);
            arr2.add(a);
        }
        return arr;
    }
}