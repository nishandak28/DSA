/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let dp = new Array(n+1).fill(-1);
    return findstair(n, dp);
};

function findstair(n , dp) {
    if(n <= 3)return n;

    if(dp[n] != -1) return dp[n];

    dp[n] = findstair(n-1,dp) + findstair(n-2,dp)
    return dp[n];
}