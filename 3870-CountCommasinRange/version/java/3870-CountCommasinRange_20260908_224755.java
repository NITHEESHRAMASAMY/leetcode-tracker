// Last updated: 9/8/2026, 10:47:55 PM
1class Solution {
2    public int countCommas(int n) {
3        int count = 0;
4        for (int i = 1; i <= n; i++) {
5            int x = i;
6            while (x >= 1000) {
7                count++;
8                x = x / 1000;
9            }
10        }
11        return count;
12    }
13}