// Last updated: 9/13/2026, 11:33:56 PM
1class Solution {
2    public int findComplement(int num) {
3        int mask = 0;
4        int n = num;
5
6        while (n > 0) {
7            mask = (mask << 1) | 1;
8            n = n >> 1;
9        }
10
11        return num ^ mask;
12    }
13}
14