// Last updated: 8/31/2026, 10:12:18 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        
4        int multiple = k;
5
6        while (true) {
7            boolean found = false;
8
9            for (int i = 0; i < nums.length; i++) {
10                if (nums[i] == multiple) {
11                    found = true;
12                    break;
13                }
14            }
15
16            if (!found) {
17                return multiple;
18            }
19
20            multiple += k;
21        }
22    }
23}