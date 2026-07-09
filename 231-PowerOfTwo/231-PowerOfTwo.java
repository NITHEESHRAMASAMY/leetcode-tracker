// Last updated: 7/9/2026, 11:49:40 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}