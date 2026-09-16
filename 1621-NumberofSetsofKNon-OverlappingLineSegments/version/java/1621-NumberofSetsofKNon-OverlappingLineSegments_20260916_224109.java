// Last updated: 9/16/2026, 10:41:09 PM
1class Solution {
2    public int numberOfSets(int n, int k) {
3        long MOD = 1000000007;
4
5        int r = 2 * k;
6        int total = n + k - 1;
7
8        long ans = 1;
9
10        for (int i = 1; i <= r; i++) {
11            ans = ans * (total - r + i) % MOD;
12            ans = ans * power(i, MOD - 2, MOD) % MOD;
13        }
14
15        return (int) ans;
16    }
17
18    public long power(long a, long b, long mod) {
19        long result = 1;
20
21        while (b > 0) {
22            if (b % 2 == 1) {
23                result = result * a % mod;
24            }
25
26            a = a * a % mod;
27            b = b / 2;
28        }
29
30        return result;
31    }
32}