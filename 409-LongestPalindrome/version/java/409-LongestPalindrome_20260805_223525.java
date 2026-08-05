// Last updated: 8/5/2026, 10:35:25 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] freq = new int[128];
4        for (char ch : s.toCharArray()) {
5            freq[ch]++;
6        }
7        int length = 0;
8        boolean odd = false;
9        for (int count : freq) {
10            if (count % 2 == 0) {
11                length += count;
12            } else {
13                length += count - 1;
14                odd = true;
15            }
16        }
17        if (odd) {
18            length++;
19        }
20        return length;
21    }
22}