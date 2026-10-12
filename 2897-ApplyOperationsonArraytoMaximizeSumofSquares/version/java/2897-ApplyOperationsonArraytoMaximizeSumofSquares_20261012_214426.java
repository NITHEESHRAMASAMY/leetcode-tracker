// Last updated: 10/12/2026, 9:44:26 PM
1class Solution {
2    public int maxSum(List<Integer> nums, int k) {
3        int MOD = 1000000007;
4        int[] bit = new int[31];
5
6        for (int num : nums) {
7            for (int i = 0; i < 31; i++) {
8                if ((num & (1 << i)) != 0) {
9                    bit[i]++;
10                }
11            }
12        }
13
14        long ans = 0;
15
16        for (int i = 0; i < k; i++) {
17            long num = 0;
18
19            for (int j = 0; j < 31; j++) {
20                if (bit[j] > 0) {
21                    num |= (1L << j);
22                    bit[j]--;
23                }
24            }
25
26            ans = (ans + num * num) % MOD;
27        }
28
29        return (int) ans;
30    }
31}