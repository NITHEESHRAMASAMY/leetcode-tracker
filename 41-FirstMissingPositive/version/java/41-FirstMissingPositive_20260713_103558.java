// Last updated: 7/13/2026, 10:35:58 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=nums[0];
4        int crr=0;
5        for(int i=0;i<nums.length;i++){
6            crr+=nums[i];
7        
8        if(crr>max){
9            max=crr;
10        }
11        if(crr<0){
12        crr=0;
13        }
14        }
15        return max;
16    }
17}