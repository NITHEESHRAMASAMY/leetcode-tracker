// Last updated: 7/20/2026, 10:52:04 PM
1class Solution {
2    public String triangleType(int[] nums) {
3        Arrays.sort(nums);
4        if(nums[0]+nums[1]<=nums[2]){
5            return"none";
6        }
7        if(nums[0]==nums[2]){
8            return"equilateral";
9        }
10        if(nums[0]==nums[1] || nums[1]==nums[2]){
11            return"isosceles";
12        }
13        return"scalene";
14    }
15}