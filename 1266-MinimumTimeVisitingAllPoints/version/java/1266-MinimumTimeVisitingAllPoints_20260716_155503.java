// Last updated: 7/16/2026, 3:55:03 PM
1class Solution {
2    public int fib(int n) {
3        if(n<=1){
4            return n;
5        }
6        return fib(n-1)+fib(n-2);
7    }
8}