// Last updated: 8/22/2026, 11:35:30 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int ori=n;
4        int rev=0;
5        int sum=0;
6        int mul=1;
7        while(n>0){
8            int dig=n%10;
9            rev=rev*10+dig;
10            sum+=dig;
11            mul*=dig;
12            n/=10;
13        }
14        int ans=sum+mul;
15        if(ori%ans==0){
16            return true;
17        }
18        else 
19        return false;
20    }
21}