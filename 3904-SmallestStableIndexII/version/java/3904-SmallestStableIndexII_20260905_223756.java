// Last updated: 9/5/2026, 10:37:56 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4
5        int[] prefixMax = new int[n];
6        int[] suffixMin = new int[n];
7
8        // Maximum from 0 to i
9        prefixMax[0] = nums[0];
10
11        for (int i = 1; i < n; i++) {
12            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
13        }
14
15        // Minimum from i to n-1
16        suffixMin[n - 1] = nums[n - 1];
17
18        for (int i = n - 2; i >= 0; i--) {
19            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
20        }
21
22        // Find first stable index
23        for (int i = 0; i < n; i++) {
24            int score = prefixMax[i] - suffixMin[i];
25
26            if (score <= k) {
27                return i;
28            }
29        }
30
31        return -1;
32    }
33}