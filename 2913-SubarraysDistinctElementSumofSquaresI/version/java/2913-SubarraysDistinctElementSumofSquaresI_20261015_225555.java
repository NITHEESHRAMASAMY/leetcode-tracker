// Last updated: 10/15/2026, 10:55:55 PM
1
2import java.util.*;
3
4class Solution {
5    public int sumCounts(List<Integer> nums) {
6        int n = nums.size();
7        int ans = 0;
8
9        for (int i = 0; i < n; i++) {
10            HashSet<Integer> set = new HashSet<>();
11
12            for (int j = i; j < n; j++) {
13                set.add(nums.get(j));
14
15                int count = set.size();
16                ans += count * count;
17            }
18        }
19
20        return ans;
21    }
22}
23