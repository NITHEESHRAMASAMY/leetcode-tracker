// Last updated: 7/30/2026, 11:04:46 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n=nums.length;
4        int arr[]=new int[n];
5        int left=0;
6        int right=n-1;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]%2==0){
9              arr[left]=nums[i];
10              left++;
11            }
12            else {
13                arr[right]=nums[i];
14                right--;
15            }
16        }
17        return arr;
18    }
19}