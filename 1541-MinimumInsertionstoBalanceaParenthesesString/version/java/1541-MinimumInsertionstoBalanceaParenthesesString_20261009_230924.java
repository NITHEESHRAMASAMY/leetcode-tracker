// Last updated: 10/9/2026, 11:09:24 PM
1class Solution {
2    public int minInsertions(String s) {
3
4        int open = 0;
5        int ans = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            if (s.charAt(i) == '(') {
10                open++;
11
12                // If the previous ')' is unmatched,
13                // insert another ')' before this '('.
14                if (i > 0 && s.charAt(i - 1) == ')') {
15                    // Handled by the closing-parenthesis logic below.
16                }
17            } 
18            else {
19                // Check whether we have a pair of '))'
20                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
21                    i++;
22                } 
23                else {
24                    ans++;
25                }
26
27                if (open > 0) {
28                    open--;
29                } 
30                else {
31                    ans++;
32                }
33            }
34        }
35
36        return ans + open * 2;
37    }
38}