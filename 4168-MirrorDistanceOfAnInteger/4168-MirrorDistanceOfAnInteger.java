// Last updated: 7/9/2026, 11:49:17 AM
class Solution {
    public int mirrorDistance(int n) {
        int ori=n;
        int rev=0;
        int res=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;
           res= Math.abs((ori-rev));
        }
        return res;
    }
}