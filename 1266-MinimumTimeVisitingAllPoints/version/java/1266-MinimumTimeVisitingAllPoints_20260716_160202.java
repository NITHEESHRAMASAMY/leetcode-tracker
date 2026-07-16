// Last updated: 7/16/2026, 4:02:02 PM
1class Solution {
2    public boolean isThree(int n) {
3        int c=0;
4        for(int i=1;i<=n;i++){
5            if(n%i==0){
6                c++;
7            }
8        }
9        return c==3;
10    }
11}