// Last updated: 7/27/2026, 2:44:33 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3      //  int c=0;
4        int max=0;
5        int max1=0;
6        for(int num: nums){
7            if(num>max){
8                max1=max;
9                max=num;
10            }
11            else if(num>max1) max1=num;
12        }
13        return (max-1)*(max1-1);
14    }
15}