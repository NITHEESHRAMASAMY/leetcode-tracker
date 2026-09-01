// Last updated: 9/1/2026, 11:00:12 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4
5        // Find longest sequential prefix
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] == nums[i - 1] + 1) {
8                sum += nums[i];
9            } else {
10                break;
11            }
12        }
13
14        // Find smallest missing number >= sum
15        while (true) {
16            boolean found = false;
17
18            for (int i = 0; i < nums.length; i++) {
19                if (nums[i] == sum) {
20                    found = true;
21                    break;
22                }
23            }
24
25            if (!found) {
26                return sum;
27            }
28
29            sum++;
30        }
31    }
32}