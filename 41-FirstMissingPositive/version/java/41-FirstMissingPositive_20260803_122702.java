// Last updated: 8/3/2026, 12:27:02 PM
1class Solution {
2    public int getSum(int a, int b) {
3        if(a==0) 
4          return b;
5        if(b==0)
6          return a;  
7        while(b!=0){
8            int c=a&b;
9            a=a^b;
10            b=c<<1;
11        }
12        return a;
13    }
14}