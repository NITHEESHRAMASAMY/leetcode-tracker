// Last updated: 10/14/2026, 11:22:19 PM
1
2class Solution {
3    public String maxSumOfSquares(int num, int sum) {
4        if (sum > 9 * num) {
5            return "";
6        }
7
8        StringBuilder ans = new StringBuilder();
9
10        for (int i = 0; i < num; i++) {
11            int digit = Math.min(9, sum);
12            ans.append(digit);
13            sum -= digit;
14        }
15
16        return ans.toString();
17    }
18}
19