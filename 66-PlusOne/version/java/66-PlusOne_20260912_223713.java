// Last updated: 9/12/2026, 10:37:13 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3
4        for (int i = digits.length - 1; i >= 0; i--) {
5
6            if (digits[i] < 9) {
7                digits[i]++;
8                return digits;
9            }
10
11            digits[i] = 0;
12        }
13
14        // If all digits were 9
15        int[] ans = new int[digits.length + 1];
16        ans[0] = 1;
17
18        return ans;
19    }
20}