class Solution {
    public int majorityElement(int[] nums) {
       
       int num = 0;
       int count = 0;

       for(int curnum : nums) {
        if(count == 0) num = curnum;
        if(num == curnum) count++;
        else count--;
       }
       return num;
    }
}