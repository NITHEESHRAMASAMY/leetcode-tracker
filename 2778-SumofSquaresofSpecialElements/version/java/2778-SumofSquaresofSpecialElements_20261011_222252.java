// Last updated: 10/11/2026, 10:22:52 PM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5
6        for (int i = 1; i <= n; i++) {
7            if (n % i == 0) {
8                sum += nums[i - 1] * nums[i - 1];
9            }
10        }
11
12        return sum;
13    }
14}