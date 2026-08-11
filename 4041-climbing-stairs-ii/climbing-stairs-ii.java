class Solution {

    // RECURSION(TIME LIMIT EXCEEDS)

    // public int climbStairs(int n, int[] costs) {
    //     return solve(0, n , costs);
    // }

    // public int solve(int i, int n, int[] costs) {
    //     if(i > n) return Integer.MAX_VALUE;
    //     if(i == n) return 0;

    //     int onestep = (i+1 <= n) ? (costs[i] + 1)+ solve(i + 1,n,costs): Integer.MAX_VALUE;
    //     int twostep = (i+2 <= n) ? (costs[i+1] + 4) + solve(i + 2,n,costs): Integer.MAX_VALUE;
    //     int threestep = (i+3 <= n) ? (costs[i+2] + 9) + solve(i + 3,n,costs): Integer.MAX_VALUE;

    //     return Math.min(onestep, Math.min(twostep, threestep));
    // }


            // DP + BACKTRACKING

    // public int climbStairs(int n, int[] costs) {
    //     int dp[] = new int[n+1];
    //     Arrays.fill(dp, -1);
    //     return solve(0, n , costs, dp);
    // }

    // public int solve(int i, int n, int[] costs, int[] dp) {
    //     if(i > n) return Integer.MAX_VALUE;
    //     if(i == n) return 0;

    //     if(dp[i] != -1) return dp[i];

    //     int onestep = (i+1 <= n) ? (costs[i] + 1)+ solve(i + 1,n,costs, dp): Integer.MAX_VALUE;
    //     int twostep = (i+2 <= n) ? (costs[i+1] + 4) + solve(i + 2,n,costs, dp): Integer.MAX_VALUE;
    //     int threestep = (i+3 <= n) ? (costs[i+2] + 9) + solve(i + 3,n,costs, dp): Integer.MAX_VALUE;

    //     return dp[i] = Math.min(onestep, Math.min(twostep, threestep));
    // }


     public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        dp[0] = 0;

        for(int j = 1; j < dp.length; j++) {
            dp[j] = Integer.MAX_VALUE;
            
            if(j-1 >= 0) {
                dp[j] = Math.min(dp[j] , dp[j-1] + costs[j-1] + 1);
            } 
            if(j-2 >= 0) {
                dp[j] = Math.min(dp[j] , dp[j-2] + costs[j-1] + 4);
            }
            if(j-3 >= 0) {
                dp[j] = Math.min(dp[j] , dp[j-3] + costs[j-1] + 9);
            }
        }

        return dp[n];
    }

    
}