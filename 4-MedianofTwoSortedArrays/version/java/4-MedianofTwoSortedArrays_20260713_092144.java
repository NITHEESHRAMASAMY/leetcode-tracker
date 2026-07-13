// Last updated: 7/13/2026, 9:21:44 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int k=0;
4        int ans[]=new int[nums1.length+nums2.length];
5        for(int i=0;i<nums1.length;i++){
6            ans[k++]=nums1[i];
7        }
8        for(int i=0;i<nums2.length;i++){
9            ans[k++]=nums2[i];
10        }
11        Arrays.sort(ans);
12        int a= ans.length/2;
13        int b=ans.length;
14        if(b%2!=0) return ans[a];
15        return (ans[a-1] + ans[a])/2.0;
16    }
17}