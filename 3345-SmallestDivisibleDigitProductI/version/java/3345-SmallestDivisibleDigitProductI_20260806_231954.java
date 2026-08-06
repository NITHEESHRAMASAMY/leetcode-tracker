// Last updated: 8/6/2026, 11:19:54 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        while (true) {
5            int temp = n;
6            int product = 1;
7
8            while (temp > 0) {
9                product *= temp % 10;
10                temp /= 10;
11            }
12
13            if (product % t == 0) {
14                return n;
15            }
16
17            n++;
18        }
19    }
20}