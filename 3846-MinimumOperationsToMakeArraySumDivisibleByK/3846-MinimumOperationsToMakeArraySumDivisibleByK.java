// Last updated: 7/9/2026, 11:49:16 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
             c+=nums[i];
        }
             if(c%k==0){
                return 0;  
             }
         for(int i=c;i>=0;i--){
            if(i%k==0){
                break;
            }
            count++; 
         }
        // count++;    
        return count;
    }
}