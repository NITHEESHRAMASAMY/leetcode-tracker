// Last updated: 9/18/2026, 10:52:40 PM
1import java.util.*;
2
3class Solution {
4    public List<String> maxNumOfSubstrings(String s) {
5        int n = s.length();
6
7        int[] first = new int[26];
8        int[] last = new int[26];
9
10        Arrays.fill(first, n);
11        Arrays.fill(last, -1);
12
13        // Find first and last occurrence
14        for (int i = 0; i < n; i++) {
15            int c = s.charAt(i) - 'a';
16
17            first[c] = Math.min(first[c], i);
18            last[c] = i;
19        }
20
21        List<int[]> intervals = new ArrayList<>();
22
23        // Create valid intervals
24        for (int c = 0; c < 26; c++) {
25
26            if (last[c] == -1) {
27                continue;
28            }
29
30            int left = first[c];
31            int right = last[c];
32
33            boolean valid = true;
34
35            for (int i = left; i <= right; i++) {
36                int x = s.charAt(i) - 'a';
37
38                // This character appeared before left
39                if (first[x] < left) {
40                    valid = false;
41                    break;
42                }
43
44                // Need to include all occurrences of this character
45                right = Math.max(right, last[x]);
46            }
47
48            if (valid) {
49                intervals.add(new int[]{left, right});
50            }
51        }
52
53        // Sort by ending position
54        intervals.sort((a, b) -> a[1] - b[1]);
55
56        List<String> ans = new ArrayList<>();
57
58        int end = -1;
59
60        for (int[] interval : intervals) {
61            int left = interval[0];
62            int right = interval[1];
63
64            if (left > end) {
65                ans.add(s.substring(left, right + 1));
66                end = right;
67            }
68        }
69
70        return ans;
71    }
72}