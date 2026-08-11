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

    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, n , costs, dp);
    }

    public int solve(int i, int n, int[] costs, int[] dp) {
        if(i > n) return Integer.MAX_VALUE;
        if(i == n) return 0;

        if(dp[i] != -1) return dp[i];

        int onestep = (i+1 <= n) ? (costs[i] + 1)+ solve(i + 1,n,costs, dp): Integer.MAX_VALUE;
        int twostep = (i+2 <= n) ? (costs[i+1] + 4) + solve(i + 2,n,costs, dp): Integer.MAX_VALUE;
        int threestep = (i+3 <= n) ? (costs[i+2] + 9) + solve(i + 3,n,costs, dp): Integer.MAX_VALUE;

        return dp[i] = Math.min(onestep, Math.min(twostep, threestep));
    }
}