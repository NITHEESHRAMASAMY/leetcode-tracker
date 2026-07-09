// Last updated: 7/9/2026, 11:49:45 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int temp[]=new int[n];
        int ind=0;
        for(int i=n-k;i<n;i++){
            temp[ind++]=nums[i] ;
        }
        for(int i=0;i<n-k;i++){
            temp[ind++]=nums[i] ;
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}