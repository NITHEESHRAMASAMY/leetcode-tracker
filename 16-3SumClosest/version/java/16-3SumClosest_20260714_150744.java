// Last updated: 7/14/2026, 3:07:44 PM
1class Solution {
2    public int addDigits(int num) {
3      //  int s=0;
4        if(num ==0) return 0;
5        while(num>=10){
6            int s=0;
7            while(num>0){
8            int dig=num%10;
9            s+=dig;
10            num/=10;
11        }
12        num=s;
13        }
14        return num;
15    }
16}