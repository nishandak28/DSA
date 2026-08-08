class Solution {
    public int coinChange(int[] coins, int amount) {
       int[]arr=new int[amount+1];
       for(int x=1;x<arr.length;x++)
       {
        arr[x]=Integer.MAX_VALUE;
        for(int coin:coins)
        {
            if(x>=coin&&arr[x-coin]!=Integer.MAX_VALUE)
            {
                arr[x]=Math.min(arr[x],arr[x-coin]+1);
            }
        }
       }
       if(arr[amount]==Integer.MAX_VALUE) return -1;
       else return arr[amount];
    }
}