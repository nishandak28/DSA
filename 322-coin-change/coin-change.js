/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
var coinChange = function(coins, amount) {
    let arr = new Array(amount+1);
    arr[0] = 0;
    let max = Infinity;
    for(let x = 1; x <= amount; x++) {
        arr[x] = max;
        for(let coin of coins) {
            if(x >= coin && arr[x-coin] != Infinity) {
                arr[x] = Math.min(arr[x], arr[x-coin]+1) 
            }
        }
    }
    if(arr[amount] === Infinity) return -1;
    else return arr[amount];
};