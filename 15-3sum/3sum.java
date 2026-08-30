class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        //  SORT THE ARRAY SO THAN GREATER AND LESSER VALUE ARE IN DIFF SIDE( TO INCREASE SUM WE CAN GO FROM LEFT TO RIGTH ), (TO DECREASE SUM WE CAN MOVE FROM RIGHT TO LEFT)

        Arrays.sort(nums);

        int i , j , k;

        for(i = 0; i < nums.length; i++) {
            if(i>0  && nums[i] == nums[i-1])continue; // TO MOVE TO NEXT ELEMENT AS CURRENT AND PREVIOUS IS SAME
            j = i+1;
            k = nums.length-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);        // VALUES ARE ADDED TO LIST
                    
                    j++;
                    k--;              // INCREMENTED AND DECREMENTED TO MAKE TO NEXT ELEMENT OR ELSE IT IS INFINITE

                    res.add(list);

                    while(j<k && nums[j] == nums[j-1]) j++;
                    // TO MOVE TO NEXT ELEMENT AS CURRENT AND PREVIOUS IS SAME AND IT IS ALREADY CHECKED
                }
                
            }
        }
        return res;
    }
}