// Last updated: 10/2/2026, 11:54:06 PM
1import java.util.*;
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5
6        List<String> ans = new ArrayList<>();
7
8        generate("", 0, 0, n, ans);
9
10        return ans;
11    }
12
13    public void generate(String s, int open, int close, int n, List<String> ans) {
14
15        if (s.length() == 2 * n) {
16            ans.add(s);
17            return;
18        }
19
20        // Add '('
21        if (open < n) {
22            generate(s + "(", open + 1, close, n, ans);
23        }
24
25        // Add ')'
26        if (close < open) {
27            generate(s + ")", open, close + 1, n, ans);
28        }
29    }
30}