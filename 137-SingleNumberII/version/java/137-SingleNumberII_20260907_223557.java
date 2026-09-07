// Last updated: 9/7/2026, 10:35:57 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans = 0;
4
5        for (int i = 0; i < 32; i++) {
6            int count = 0;
7
8            for (int num : nums) {
9                if ((num & (1 << i)) != 0) {
10                    count++;
11                }
12            }
13
14            if (count % 3 != 0) {
15                ans = ans | (1 << i);
16            }
17        }
18
19        return ans;
20    }
21}