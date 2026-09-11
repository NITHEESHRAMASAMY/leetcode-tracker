// Last updated: 9/11/2026, 11:48:02 PM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int[] count = new int[10];
4
5        for (int d : digits) {
6            count[d]++;
7        }
8
9        boolean[] used = new boolean[1000];
10        int ans = 0;
11
12        for (int i = 1; i <= 9; i++) {
13            for (int j = 0; j <= 9; j++) {
14                for (int k = 0; k <= 8; k += 2) {
15
16                    int num = i * 100 + j * 10 + k;
17
18                    int[] need = new int[10];
19                    need[i]++;
20                    need[j]++;
21                    need[k]++;
22
23                    boolean possible = true;
24
25                    for (int d = 0; d <= 9; d++) {
26                        if (need[d] > count[d]) {
27                            possible = false;
28                            break;
29                        }
30                    }
31
32                    if (possible && !used[num]) {
33                        used[num] = true;
34                        ans++;
35                    }
36                }
37            }
38        }
39
40        return ans;
41    }
42}