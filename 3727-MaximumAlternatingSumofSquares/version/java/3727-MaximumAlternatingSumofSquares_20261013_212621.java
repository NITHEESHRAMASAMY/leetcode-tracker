// Last updated: 10/13/2026, 9:26:21 PM
1
2
3class Solution {
4    public long maxAlternatingSum(int[] nums) {
5        int n = nums.length;
6        long[] squares = new long[n];
7
8        for (int i = 0; i < n; i++) {
9            squares[i] = (long) nums[i] * nums[i];
10        }
11
12        Arrays.sort(squares);
13
14        long ans = 0;
15        int half = n / 2;
16
17        for (int i = 0; i < half; i++) {
18            ans -= squares[i];
19        }
20
21        for (int i = half; i < n; i++) {
22            ans += squares[i];
23        }
24
25        return ans;
26    }
27}
28
29
30