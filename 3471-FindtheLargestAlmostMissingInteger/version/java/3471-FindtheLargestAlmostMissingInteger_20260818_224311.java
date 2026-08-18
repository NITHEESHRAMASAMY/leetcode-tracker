// Last updated: 8/18/2026, 10:43:11 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int ans = -1;
4
5        for (int x = 0; x <= 50; x++) {
6            int count = 0;
7
8            for (int i = 0; i <= nums.length - k; i++) {
9                boolean found = false;
10
11                for (int j = i; j < i + k; j++) {
12                    if (nums[j] == x) {
13                        found = true;
14                        break;
15                    }
16                }
17
18                if (found) {
19                    count++;
20                }
21            }
22
23            if (count == 1) {
24                ans = Math.max(ans, x);
25            }
26        }
27
28        return ans;
29    }
30}