// Last updated: 10/16/2026, 10:02:05 PM
1
2import java.util.*;
3
4class Solution {
5    static final long MOD = 1_000_000_007L;
6
7    public int sumCounts(int[] nums) {
8        int n = nums.length;
9        SegmentTree seg = new SegmentTree(n);
10        int[] last = new int[100001];
11        Arrays.fill(last, -1);
12
13        long ans = 0;
14
15        for (int i = 0; i < n; i++) {
16            int x = nums[i];
17            int prev = last[x];
18
19            seg.update(prev + 1, i, 1);
20            ans = (ans + seg.query(0, i)) % MOD;
21
22            last[x] = i;
23        }
24
25        return (int) ans;
26    }
27
28    static class SegmentTree {
29        int n;
30        long[] sum, sq, lazy;
31
32        SegmentTree(int n) {
33            this.n = n;
34            sum = new long[4 * n];
35            sq = new long[4 * n];
36            lazy = new long[4 * n];
37        }
38
39        void apply(int node, int l, int r, long val) {
40            long len = r - l + 1L;
41
42            sq[node] = (sq[node]
43                    + 2 * val % MOD * sum[node] % MOD
44                    + len * val % MOD * val % MOD) % MOD;
45
46            sum[node] = (sum[node] + len * val) % MOD;
47            lazy[node] = (lazy[node] + val) % MOD;
48        }
49
50        void push(int node, int l, int r) {
51            if (lazy[node] == 0 || l == r) {
52                return;
53            }
54
55            int mid = (l + r) / 2;
56            apply(node * 2, l, mid, lazy[node]);
57            apply(node * 2 + 1, mid + 1, r, lazy[node]);
58            lazy[node] = 0;
59        }
60
61        void pull(int node) {
62            sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
63            sq[node] = (sq[node * 2] + sq[node * 2 + 1]) % MOD;
64        }
65
66        void update(int ql, int qr, long val) {
67            if (ql > qr) return;
68            update(1, 0, n - 1, ql, qr, val);
69        }
70
71        void update(int node, int l, int r,
72                    int ql, int qr, long val) {
73            if (ql <= l && r <= qr) {
74                apply(node, l, r, val);
75                return;
76            }
77
78            push(node, l, r);
79            int mid = (l + r) / 2;
80
81            if (ql <= mid) {
82                update(node * 2, l, mid, ql, qr, val);
83            }
84
85            if (qr > mid) {
86                update(node * 2 + 1, mid + 1, r, ql, qr, val);
87            }
88
89            pull(node);
90        }
91
92        long query(int ql, int qr) {
93            return query(1, 0, n - 1, ql, qr);
94        }
95
96        long query(int node, int l, int r,
97                   int ql, int qr) {
98            if (ql <= l && r <= qr) {
99                return sq[node];
100            }
101
102            push(node, l, r);
103            int mid = (l + r) / 2;
104            long result = 0;
105
106            if (ql <= mid) {
107                result = query(node * 2, l, mid, ql, qr);
108            }
109
110            if (qr > mid) {
111                result = (result
112                        + query(node * 2 + 1, mid + 1, r, ql, qr))
113                        % MOD;
114            }
115
116            return result;
117        }
118    }
119}
120