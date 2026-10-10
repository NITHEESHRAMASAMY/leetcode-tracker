// Last updated: 10/10/2026, 10:57:11 PM
1
2class Solution {
3    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
4        long k = (long) k1 + k2;
5        int[] freq = new int[100001];
6        long sum = 0;
7
8        for (int i = 0; i < nums1.length; i++) {
9            int d = Math.abs(nums1[i] - nums2[i]);
10            freq[d]++;
11            sum += d;
12        }
13
14        if (k >= sum) {
15            return 0;
16        }
17
18        for (int d = 100000; d > 0 && k > 0; d--) {
19            if (freq[d] == 0) {
20                continue;
21            }
22
23            int next = d - 1;
24            long count = Math.min((long) freq[d], k);
25
26            freq[d] -= (int) count;
27            freq[next] += (int) count;
28            k -= count;
29        }
30
31        long ans = 0;
32
33        for (int d = 1; d <= 100000; d++) {
34            ans += (long) d * d * freq[d];
35        }
36
37        return ans;
38    }
39}
40