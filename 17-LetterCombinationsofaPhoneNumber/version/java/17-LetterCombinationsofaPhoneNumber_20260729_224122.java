// Last updated: 7/29/2026, 10:41:22 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0){
4            return false;
5        }
6               while (n % 3 == 0) {
7            n /= 3;
8        }
9        return n == 1;
10    }
11}