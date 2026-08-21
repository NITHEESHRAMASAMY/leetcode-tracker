// Last updated: 8/21/2026, 11:16:29 PM
1class Solution {
2    public int deleteGreatestValue(int[][] grid) {
3        int ans = 0;
4
5        for (int i = 0; i < grid.length; i++) {
6            Arrays.sort(grid[i]);
7        }
8
9        for (int j = grid[0].length - 1; j >= 0; j--) {
10            int max = 0;
11
12            for (int i = 0; i < grid.length; i++) {
13                max = Math.max(max, grid[i][j]);
14            }
15
16            ans += max;
17        }
18
19        return ans;
20    }
21}