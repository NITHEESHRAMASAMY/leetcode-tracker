// Last updated: 8/15/2026, 10:19:14 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i = 0;
4        int j = 0;
5        while (i < s.length() && j < t.length()) {
6            if (s.charAt(i) == t.charAt(j)) {
7                i++;
8            }
9            j++;
10        }
11        return i == s.length();
12    }
13}