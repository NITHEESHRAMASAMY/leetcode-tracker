// Last updated: 9/29/2026, 9:44:23 PM
1class Solution {
2    public boolean hasValidPath(char[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        if ((m + n - 1) % 2 != 0) {
8            return false;
9        }
10
11        boolean[][][] dp = new boolean[m][n][m + n + 1];
12
13        // Starting cell
14        if (grid[0][0] == '(') {
15            dp[0][0][1] = true;
16        }
17
18        for (int i = 0; i < m; i++) {
19            for (int j = 0; j < n; j++) {
20
21                for (int balance = 0; balance <= m + n; balance++) {
22
23                    if (!dp[i][j][balance]) {
24                        continue;
25                    }
26
27                    // Move down
28                    if (i + 1 < m) {
29                        if (grid[i + 1][j] == '(') {
30                            dp[i + 1][j][balance + 1] = true;
31                        } else if (balance > 0) {
32                            dp[i + 1][j][balance - 1] = true;
33                        }
34                    }
35
36                    // Move right
37                    if (j + 1 < n) {
38                        if (grid[i][j + 1] == '(') {
39                            dp[i][j + 1][balance + 1] = true;
40                        } else if (balance > 0) {
41                            dp[i][j + 1][balance - 1] = true;
42                        }
43                    }
44                }
45            }
46        }
47
48        return dp[m - 1][n - 1][0];
49    }
50}