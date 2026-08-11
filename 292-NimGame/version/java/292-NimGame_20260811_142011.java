// Last updated: 8/11/2026, 2:20:11 PM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4
5        while (x != 0) {
6            int dig = x % 10;
7
8            if (rev > Integer.MAX_VALUE / 10 ||
9                (rev == Integer.MAX_VALUE / 10 && dig > 7)) {
10                return 0;
11            }
12
13            if (rev < Integer.MIN_VALUE / 10 ||
14                (rev == Integer.MIN_VALUE / 10 && dig < -8)) {
15                return 0;
16            }
17
18            rev = rev * 10 + dig;
19            x /= 10;
20        }
21
22        return rev;
23    }
24}