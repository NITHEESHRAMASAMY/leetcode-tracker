// Last updated: 8/14/2026, 11:21:37 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int[] count = new int[26];
4
5        int left = 0;
6        int max = 0;
7
8        for (int right = 0; right < s.length(); right++) {
9            int index = s.charAt(right) - 'a';
10            count[index]++;
11
12            while (count[index] > 2) {
13                count[s.charAt(left) - 'a']--;
14                left++;
15            }
16
17            max = Math.max(max, right - left + 1);
18        }
19
20        return max;
21    }
22}