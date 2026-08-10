class Solution {
    int count = 0;
    public int climbStairs(int n) {

        //  IF WE USE THE RECURSION THEN THE TIME COMPLEXITY WILL BE O(N)^2
/*
        if(n <= 3)return n;
        return(climbStairs(n-1) + climbStairs(n-2));
*/        

        // WE CAN USE THE FIBBONACI SERIOUS

  
/*  
        if(n <= 2)return n;
        
        int first = 1;
        int second = 2;

        for(int i = 3;i <= n;i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;

*/

     // RECURSION + DP COMBINATION

      int dp[] = new int[n+1];
      Arrays.fill(dp,-1);
      return helper(n,dp);
    }
    public int helper(int n, int dp[] ){
        if(n <= 2)return n;
        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] = helper(n-1,dp) + helper(n-2,dp);
        return dp[n];
    }
}  