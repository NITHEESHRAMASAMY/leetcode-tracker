// Last updated: 7/9/2026, 11:50:03 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ori=x;
     int rev=0;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
         return ori==rev; 
    }
}