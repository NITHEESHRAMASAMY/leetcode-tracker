// Last updated: 7/27/2026, 3:18:35 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max=Integer.MIN_VALUE;
4          int max1=Integer.MIN_VALUE;
5        while(n>0){
6            int dig=n%10;
7           if(dig>max){
8            max1=max;
9            max=dig;
10           }
11           else if(dig>max1){
12            max1=dig;
13           }
14           n/=10;
15        }
16        return max*max1;
17    }
18}