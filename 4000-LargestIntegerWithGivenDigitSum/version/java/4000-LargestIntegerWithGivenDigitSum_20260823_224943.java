// Last updated: 8/23/2026, 10:49:43 PM
1class Solution {
2    public int largestInteger(int n, int s) {
3
4        if (s == 0) {
5            return 0;
6        }
7
8        if (s > n * 9) {
9            return -1;
10        }
11
12        int ans = 0;
13
14        for (int i = 0; i < n; i++) {
15            int digit = Math.min(9, s);
16
17            ans = ans * 10 + digit;
18
19            s -= digit;
20        }
21
22        return ans;
23    }
24}