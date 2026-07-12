// Last updated: 7/12/2026, 11:43:33 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");
4        StringBuilder sb = new StringBuilder();
5
6        for (int i = words.length - 1; i >= 0; i--) {
7            sb.append(words[i]);
8
9            if (i != 0) {
10                sb.append(" ");
11            }
12        }
13
14        return sb.toString();
15    }
16}