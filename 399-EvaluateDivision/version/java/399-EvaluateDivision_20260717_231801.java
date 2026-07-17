// Last updated: 7/17/2026, 11:18:01 PM
1class Solution {
2    public int integerReplacement(int n) {
3        int c=0;
4                long tar=n;
5        while(tar!=1){
6            if(tar%2==0){
7              tar/=2;
8            }
9            else{
10                if(tar==3 || tar%4==1){
11                    tar--;
12
13                }
14                else{
15                    tar++;
16                }
17            }
18           c++;
19                
20            }
21       return c;
22    }
23}