// Last updated: 7/27/2026, 2:59:26 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int l=nums.length;
4        // int max=Integer.MIN_VALUE;
5        // int max1=Integer.MIN_VALUE;
6        // int max2=Integer.MIN_VALUE;
7        // for(int num:nums){
8        //     if(num>max){
9        //         max2=max1;
10        //         max1=max;
11        //         max=num;
12        //     }
13        //     else if(num>max1){
14        //         max2=max1;
15        //         max1=num;
16        //     }
17        //     else if(num>max2){
18        //         max2=num;
19        //     }
20        // }
21        
22        // return max*max1*max2;
23        Arrays.sort(nums);
24        int max1=nums[l-1]*nums[l-2]*nums[l-3];
25        int max2=nums[0]*nums[1]*nums[l-1];
26        int ans=Math.max(max1,max2);
27        return ans;
28    }
29}