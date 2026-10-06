// Last updated: 10/6/2026, 10:43:04 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3
4        int open = 0;
5        int ans = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            if (s.charAt(i) == '(') {
10                open++;
11            } 
12            else {
13                if (open > 0) {
14                    open--;
15                } 
16                else {
17                    ans++;
18                }
19            }
20        }
21
22        return ans + open;
23    }
24}