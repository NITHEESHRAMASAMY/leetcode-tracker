// Last updated: 10/5/2026, 11:10:04 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3
4        int depth = 0;
5        int score = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            if (s.charAt(i) == '(') {
10                depth++;
11            } 
12            else {
13                depth--;
14
15                // "()"
16                if (s.charAt(i - 1) == '(') {
17                    score += 1 << depth;
18                }
19            }
20        }
21
22        return score;
23    }
24}