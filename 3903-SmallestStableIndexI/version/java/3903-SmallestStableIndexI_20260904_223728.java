// Last updated: 9/4/2026, 10:37:28 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4
5        for (int i = 0; i < n; i++) {
6            int max = nums[0];
7
8            for (int j = 0; j <= i; j++) {
9                if (nums[j] > max) {
10                    max = nums[j];
11                }
12            }
13
14            int min = nums[i];
15
16            for (int j = i; j < n; j++) {
17                if (nums[j] < min) {
18                    min = nums[j];
19                }
20            }
21
22            if (max - min <= k) {
23                return i;
24            }
25        }
26
27        return -1;
28    }
29}