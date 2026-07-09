// Last updated: 7/9/2026, 11:48:36 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if (n <= 0) return false;
4        while(n%2==0){
5            n/=2;
6        }
7        while(n%3==0){
8            n/=3;
9        }
10        while(n%5== 0){
11            n/=5;
12        }
13        return n==1;
14    }
15}