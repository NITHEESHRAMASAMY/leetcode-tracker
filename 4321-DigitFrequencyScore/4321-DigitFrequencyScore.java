// Last updated: 7/9/2026, 11:49:21 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int c=0;
       while(n>0){
        int dig=n%10;
        c+=dig;
        n/=10;
       }
       return c;
    }
}