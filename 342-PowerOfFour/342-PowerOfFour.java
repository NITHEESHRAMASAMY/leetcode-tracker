// Last updated: 7/9/2026, 11:49:34 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) 
        return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}