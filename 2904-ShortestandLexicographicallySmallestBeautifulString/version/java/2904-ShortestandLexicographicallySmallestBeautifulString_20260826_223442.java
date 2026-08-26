// Last updated: 8/26/2026, 10:34:42 PM
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3
4        String ans = "";
5
6        for (int i = 0; i < s.length(); i++) {
7
8            int count = 0;
9
10            for (int j = i; j < s.length(); j++) {
11
12                if (s.charAt(j) == '1') {
13                    count++;
14                }
15
16                if (count == k) {
17
18                    String temp = s.substring(i, j + 1);
19
20                    if (ans.equals("") ||
21                        temp.length() < ans.length() ||
22                        (temp.length() == ans.length() &&
23                         temp.compareTo(ans) < 0)) {
24
25                        ans = temp;
26                    }
27
28                    break;
29                }
30            }
31        }
32
33        return ans;
34    }
35}