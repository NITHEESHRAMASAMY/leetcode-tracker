// Last updated: 7/13/2026, 9:28:10 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int a=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                a=i;
7                break;
8            }
9            else 
10               a=-1;
11        }
12        return a;
13    }
14}