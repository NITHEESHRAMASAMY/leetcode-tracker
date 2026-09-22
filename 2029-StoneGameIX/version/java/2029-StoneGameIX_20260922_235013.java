// Last updated: 9/22/2026, 11:50:13 PM
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5
6        // suf[i] = smallest index j such that
7        // word2[j...] can be matched in word1[i...]
8        int[] suf = new int[m + 1];
9
10        suf[m] = n;
11
12        int j = n - 1;
13
14        // Match word2 from right to left
15        for (int i = m - 1; i >= 0; i--) {
16            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
17                j--;
18            }
19
20            suf[i] = j + 1;
21        }
22
23        int[] ans = new int[n];
24
25        j = 0;
26        boolean changed = false;
27        int size = 0;
28
29        // Greedily choose the smallest possible index
30        for (int i = 0; i < m; i++) {
31
32            if (word1.charAt(i) == word2.charAt(j) ||
33                (!changed && suf[i + 1] <= j + 1)) {
34
35                // Use our one allowed mismatch
36                if (word1.charAt(i) != word2.charAt(j)) {
37                    changed = true;
38                }
39
40                ans[size++] = i;
41                j++;
42
43                if (j == n) {
44                    return ans;
45                }
46            }
47        }
48
49        return new int[0];
50    }
51}