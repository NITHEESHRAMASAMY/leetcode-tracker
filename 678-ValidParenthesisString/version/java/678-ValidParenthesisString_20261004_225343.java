// Last updated: 10/4/2026, 10:53:43 PM
1class Solution {
2    public boolean checkValidString(String s) {
3
4        int low = 0;
5        int high = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            char ch = s.charAt(i);
10
11            if (ch == '(') {
12                low++;
13                high++;
14            }
15            else if (ch == ')') {
16                low--;
17                high--;
18            }
19            else {
20                // '*' can be '(' or ')' or empty
21                low--;
22                high++;
23            }
24
25            // Too many ')' 
26            if (high < 0) {
27                return false;
28            }
29
30            // low cannot be negative
31            if (low < 0) {
32                low = 0;
33            }
34        }
35
36        return low == 0;
37    }
38}