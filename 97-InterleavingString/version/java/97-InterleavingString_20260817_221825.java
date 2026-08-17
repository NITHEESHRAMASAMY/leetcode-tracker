// Last updated: 8/17/2026, 10:18:25 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        if (s1.length() + s2.length() != s3.length()) {
5            return false;
6        }
7
8        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
9
10        dp[0][0] = true;
11
12        for (int i = 0; i <= s1.length(); i++) {
13            for (int j = 0; j <= s2.length(); j++) {
14
15                if (i == 0 && j == 0) {
16                    continue;
17                }
18
19                if (i > 0 &&
20                    dp[i - 1][j] &&
21                    s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
22
23                    dp[i][j] = true;
24                }
25
26                if (j > 0 &&
27                    dp[i][j - 1] &&
28                    s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
29
30                    dp[i][j] = true;
31                }
32            }
33        }
34
35        return dp[s1.length()][s2.length()];
36    }
37}