// Last updated: 8/9/2026, 10:58:04 PM
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n + 1];
4        for (int i = 1; i <= n; i++) {
5            dp[i] = i;
6        }
7        for (int i=1;i<=n;i++){
8            for(int j=1;j*j<=i;j++) {
9                dp[i] = Math.min(dp[i],dp[i - j * j] + 1);
10            }
11        }
12        return dp[n];
13    }
14}