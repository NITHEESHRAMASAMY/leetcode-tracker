// Last updated: 9/30/2026, 10:49:43 PM
1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3
4        int[] ans = new int[seq.length()];
5        int depth = 0;
6
7        for (int i = 0; i < seq.length(); i++) {
8
9            if (seq.charAt(i) == '(') {
10                depth++;
11
12                if (depth % 2 == 0) {
13                    ans[i] = 1;
14                } else {
15                    ans[i] = 0;
16                }
17            } 
18            else {
19                
20                if (depth % 2 == 0) {
21                    ans[i] = 1;
22                } else {
23                    ans[i] = 0;
24                }
25
26                depth--;
27            }
28        }
29
30        return ans;
31    }
32}