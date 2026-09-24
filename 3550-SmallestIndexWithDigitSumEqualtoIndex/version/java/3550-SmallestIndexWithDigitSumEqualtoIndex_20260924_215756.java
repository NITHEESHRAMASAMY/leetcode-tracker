// Last updated: 9/24/2026, 9:57:56 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3
4        for (int i = 0; i < nums.length; i++) {
5
6            int num = nums[i];
7            int sum = 0;
8
9            while (num > 0) {
10                sum += num % 10;
11                num = num / 10;
12            }
13
14            if (sum == i) {
15                return i;
16            }
17        }
18
19        return -1;
20    }
21}