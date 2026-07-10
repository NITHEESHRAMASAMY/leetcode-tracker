// Last updated: 7/10/2026, 11:48:18 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] ugly = new int[n];
4
5        ugly[0] = 1;
6
7        int i2 = 0, i3 = 0, i5 = 0;
8
9        for (int i = 1; i < n; i++) {
10
11            int next2 = ugly[i2] * 2;
12            int next3 = ugly[i3] * 3;
13            int next5 = ugly[i5] * 5;
14
15            int next = Math.min(next2, Math.min(next3, next5));
16
17            ugly[i] = next;
18
19            if (next == next2) i2++;
20            if (next == next3) i3++;
21            if (next == next5) i5++;
22        }
23
24        return ugly[n - 1];
25    }
26}