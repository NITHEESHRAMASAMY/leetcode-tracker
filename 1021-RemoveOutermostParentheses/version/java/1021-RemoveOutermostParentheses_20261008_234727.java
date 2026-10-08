// Last updated: 10/8/2026, 11:47:27 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3
4        String ans = "";
5        int count = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            if (s.charAt(i) == '(') {
10                if (count > 0) {
11                    ans += s.charAt(i);
12                }
13                count++;
14            } 
15            else {
16                count--;
17
18                if (count > 0) {
19                    ans += s.charAt(i);
20                }
21            }
22        }
23
24        return ans;
25    }
26}