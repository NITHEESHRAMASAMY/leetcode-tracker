// Last updated: 8/30/2026, 10:24:45 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4
5        int minIndex = 0;
6        int maxIndex = 0;
7
8        for (int i = 1; i < n; i++) {
9            if (nums[i] < nums[minIndex]) {
10                minIndex = i;
11            }
12
13            if (nums[i] > nums[maxIndex]) {
14                maxIndex = i;
15            }
16        }
17
18        int left = Math.min(minIndex, maxIndex);
19        int right = Math.max(minIndex, maxIndex);
20
21        int front = right + 1;
22        int back = n - left;
23        int both = (left + 1) + (n - right);
24
25        return Math.min(front, Math.min(back, both));
26    }
27}