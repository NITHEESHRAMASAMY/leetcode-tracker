// Last updated: 7/9/2026, 11:49:29 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
     int n=nums.length;
     int[] n1=new int[2*n];
     for(int i=0;i<n;i++){
        n1[i]=nums[i];
     }
     for(int i=0;i<n;i++) n1[i+n]=nums[i];
     return n1;
    }
}