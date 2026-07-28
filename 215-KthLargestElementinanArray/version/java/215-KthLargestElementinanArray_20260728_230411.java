// Last updated: 7/28/2026, 11:04:11 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int arr[]=new int[n];
5        arr[0]=1;
6        for(int i=1;i<n;i++){
7            arr[i]=arr[i-1]*nums[i-1];
8          
9          }
10            int p=1;
11            for(int j=n-1;j>=0;j--){
12               arr[j]*=p;
13                    p*=nums[j];
14                }
15        return arr;
16    }
17}