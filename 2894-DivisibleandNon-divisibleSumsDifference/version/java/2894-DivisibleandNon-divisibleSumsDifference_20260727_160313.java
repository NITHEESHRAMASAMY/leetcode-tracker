// Last updated: 7/27/2026, 4:03:13 PM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int sum=0;
4        int mul=1;
5        while(n>0){
6            int dig=n%10;
7            sum+=dig;
8            mul*=dig;
9            n/=10;
10        }
11        int ans=mul-sum;
12        return ans;
13    }
14}