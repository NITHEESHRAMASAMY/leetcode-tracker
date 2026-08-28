// Last updated: 8/28/2026, 11:27:44 PM
1class Solution {
2    public boolean canTransform(String start, String result) {
3
4        int i = 0;
5        int j = 0;
6        int n = start.length();
7
8        while (i < n || j < n) {
9
10            // Skip X in start
11            while (i < n && start.charAt(i) == 'X') {
12                i++;
13            }
14
15            // Skip X in result
16            while (j < n && result.charAt(j) == 'X') {
17                j++;
18            }
19
20            // Both reached the end
21            if (i == n && j == n) {
22                return true;
23            }
24
25            // Only one reached the end
26            if (i == n || j == n) {
27                return false;
28            }
29
30            char a = start.charAt(i);
31            char b = result.charAt(j);
32
33            // L/R order must be same
34            if (a != b) {
35                return false;
36            }
37
38            // L can only move to the left
39            if (a == 'L' && i < j) {
40                return false;
41            }
42
43            // R can only move to the right
44            if (a == 'R' && i > j) {
45                return false;
46            }
47
48            i++;
49            j++;
50        }
51
52        return true;
53    }
54}