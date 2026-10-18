// Last updated: 10/18/2026, 11:03:33 PM
1
2import java.util.*;
3
4class Solution {
5    static final long MOD = 1_000_000_007L;
6    long[][] comb;
7
8    public int numOfWays(int[] nums) {
9        int n = nums.length;
10
11        comb = new long[n + 1][n + 1];
12
13        for (int i = 0; i <= n; i++) {
14            comb[i][0] = 1;
15            comb[i][i] = 1;
16
17            for (int j = 1; j < i; j++) {
18                comb[i][j] = (comb[i - 1][j - 1]
19                        + comb[i - 1][j]) % MOD;
20            }
21        }
22
23        List<Integer> list = new ArrayList<>();
24        for (int num : nums) {
25            list.add(num);
26        }
27
28        return (int) ((solve(list) - 1 + MOD) % MOD);
29    }
30
31    private long solve(List<Integer> nums) {
32        int n = nums.size();
33
34        if (n <= 2) {
35            return 1;
36        }
37
38        int root = nums.get(0);
39
40        List<Integer> left = new ArrayList<>();
41        List<Integer> right = new ArrayList<>();
42
43        for (int i = 1; i < n; i++) {
44            if (nums.get(i) < root) {
45                left.add(nums.get(i));
46            } else {
47                right.add(nums.get(i));
48            }
49        }
50
51        long leftWays = solve(left);
52        long rightWays = solve(right);
53
54        long ways = comb[n - 1][left.size()];
55        ways = ways * leftWays % MOD;
56        ways = ways * rightWays % MOD;
57
58        return ways;
59    }
60}
61