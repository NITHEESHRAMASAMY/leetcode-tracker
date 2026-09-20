// Last updated: 9/20/2026, 10:27:18 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int sum = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            int reversePosition = 26 - (s.charAt(i) - 'a');
7            int stringPosition = i + 1;
8
9            sum += reversePosition * stringPosition;
10        }
11
12        return sum;
13    }
14}