// Last updated: 9/21/2026, 10:48:24 PM
1class Solution {
2    public long[] resultArray(int[] nums, int k) {
3        long[] result = new long[k];
4
5        long[] dp = new long[k];
6
7        for (int num : nums) {
8            long[] next = new long[k];
9
10            int value = num % k;
11
12            // Start a new subarray
13            next[value]++;
14
15            // Extend previous subarrays
16            for (int r = 0; r < k; r++) {
17                int newRemainder = (r * value) % k;
18                next[newRemainder] += dp[r];
19            }
20
21            // Add to answer
22            for (int r = 0; r < k; r++) {
23                result[r] += next[r];
24            }
25
26            dp = next;
27        }
28
29        return result;
30    }
31}