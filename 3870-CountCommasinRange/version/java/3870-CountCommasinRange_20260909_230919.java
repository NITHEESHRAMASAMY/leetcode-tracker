// Last updated: 9/9/2026, 11:09:19 PM
1class Solution {
2    public long countCommas(long n) {
3        long ans = 0;
4
5        long p = 1000;
6
7        while (p <= n) {
8            ans += n - p + 1;
9            p *= 1000;
10        }
11
12        return ans;
13    }
14}