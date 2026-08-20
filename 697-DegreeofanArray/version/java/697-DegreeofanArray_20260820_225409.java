// Last updated: 8/20/2026, 10:54:09 PM
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3
4        int[] count = new int[50000];
5        int[] first = new int[50000];
6        int[] last = new int[50000];
7
8        // Store first and last positions
9        for (int i = 0; i < nums.length; i++) {
10
11            int num = nums[i];
12
13            count[num]++;
14
15            if (count[num] == 1) {
16                first[num] = i;
17            }
18
19            last[num] = i;
20        }
21        int degree = 0;
22
23        for (int i = 0; i < 50000; i++) {
24            degree = Math.max(degree, count[i]);
25        }
26        int ans = nums.length;
27
28        for (int i = 0; i < 50000; i++) {
29
30            if (count[i] == degree) {
31                int length = last[i] - first[i] + 1;
32                ans = Math.min(ans, length);
33            }
34        }
35
36        return ans;
37    }
38}