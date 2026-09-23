// Last updated: 9/23/2026, 11:52:48 PM
1class Solution {
2    public int minOperations(int[] nums, int x) {
3
4        int n = nums.length;
5
6        long total = 0;
7
8        for (int num : nums) {
9            total += num;
10        }
11
12        long target = total - x;
13
14        // If target is negative, impossible
15        if (target < 0) {
16            return -1;
17        }
18
19        // If target is 0, remove everything
20        if (target == 0) {
21            return n;
22        }
23
24        int left = 0;
25        long sum = 0;
26        int maxLength = -1;
27
28        for (int right = 0; right < n; right++) {
29
30            sum += nums[right];
31
32            while (sum > target && left <= right) {
33                sum -= nums[left];
34                left++;
35            }
36
37            if (sum == target) {
38                maxLength = Math.max(maxLength, right - left + 1);
39            }
40        }
41
42        if (maxLength == -1) {
43            return -1;
44        }
45
46        return n - maxLength;
47    }
48}