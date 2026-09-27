// Last updated: 9/27/2026, 10:24:25 PM
1class Solution {
2    public String reverseParentheses(String s) {
3
4        for (int i = s.length() - 1; i >= 0; i--) {
5
6            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
7
8                // Find an opening bracket
9                if (s.charAt(i) == '(') {
10                    int j = i + 1;
11
12                    // Find the matching closing bracket
13                    while (s.charAt(j) != ')') {
14                        j++;
15                    }
16
17                    // Reverse the part inside brackets
18                    String part = s.substring(i + 1, j);
19                    String reverse = new StringBuilder(part).reverse().toString();
20
21                    // Replace (part) with reversed part
22                    s = s.substring(0, i) + reverse + s.substring(j + 1);
23
24                    // Start again because brackets may be nested
25                    i = s.length();
26                }
27            }
28        }
29
30        return s;
31    }
32}